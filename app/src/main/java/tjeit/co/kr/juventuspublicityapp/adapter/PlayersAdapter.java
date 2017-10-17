package tjeit.co.kr.juventuspublicityapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.data.Players;
import tjeit.co.kr.juventuspublicityapp.util.GlobalData;

/**
 * Created by joeun on 2017-10-17.
 */

public class PlayersAdapter extends ArrayAdapter<Players> {

    Context mContext;
    List<Players> mList;
    LayoutInflater inf;

    public PlayersAdapter(Context context, List<Players> list) {
        super(context, R.layout.player_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.player_list_item, null);
        }
        Players data = mList.get(position);

        TextView nameTxt = (TextView) row.findViewById(R.id.nameTxt);
        TextView joinTxt = (TextView) row.findViewById(R.id.joinTxt);
        TextView nationalTxt = (TextView) row.findViewById(R.id.nationalTxt);
        TextView backNumTxt = (TextView) row.findViewById(R.id.backNumTxt);

        return row;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
