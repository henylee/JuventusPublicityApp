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
import tjeit.co.kr.juventuspublicityapp.data.Players;

/**
 * Created by joeun on 2017-10-17.
 */

public class ManagerAdapter extends ArrayAdapter<Players> {

    Context mContext;
    List<Players> mList;
    LayoutInflater inf;

    public ManagerAdapter(Context context, List<Players> list) {
        super(context, R.layout.manager_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.manager_list_item, null);
        }
        return row;
    }

}
