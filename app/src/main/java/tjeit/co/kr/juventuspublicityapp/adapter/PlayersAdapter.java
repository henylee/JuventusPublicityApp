package tjeit.co.kr.juventuspublicityapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

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

        ImageView profileImg = (ImageView) row.findViewById(R.id.profileImg);
        TextView nameTxt = (TextView) row.findViewById(R.id.nameTxt);
        TextView joinTxt = (TextView) row.findViewById(R.id.joinTxt);
        TextView nationalTxt = (TextView) row.findViewById(R.id.nationalTxt);
        TextView backNumTxt = (TextView) row.findViewById(R.id.backNumTxt);
        TextView nationTxt = (TextView) row.findViewById(R.id.nationTxt);

        nameTxt.setText(data.getName());
        nationTxt.setText("국가 : "+data.getNational());
        joinTxt.setText("입단 년도 : "+data.getJoin());
        backNumTxt.setText("등번호 : "+data.getBackNumber()+"번");
        nationalTxt.setText("국가대표 : "+data.getNationalGame()+"경기"+"\n"+" SERIA A : "+data.getClubGame()+"경기");
        Glide.with(mContext).load(data.getProfileImg()).into(profileImg);

        return row;
    }
}
