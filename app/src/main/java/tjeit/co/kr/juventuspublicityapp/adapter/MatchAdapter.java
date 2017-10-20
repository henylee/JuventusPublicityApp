package tjeit.co.kr.juventuspublicityapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.data.Match;

/**
 * Created by joeun on 2017-10-20.
 */

public class MatchAdapter extends ArrayAdapter<Match> {

    Context mContext;
    List<Match> mList;
    LayoutInflater inf;

    public MatchAdapter(Context context, List<Match> list) {
        super(context, R.layout.math_list_item, list);

        mContext=context;
        mList=list;
        inf=LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;

        if (row==null) {
            row=inf.inflate(R.layout.math_list_item, null);
        }

        Match data = mList.get(position);

        return row;
    }

}
