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
import tjeit.co.kr.juventuspublicityapp.data.TeamMatch;

/**
 * Created by joeun on 2017-10-17.
 */

public class TeamRankAdapter extends ArrayAdapter<TeamMatch> {

    Context mContext;
    List<TeamMatch> mList;
    LayoutInflater inf;

    public TeamRankAdapter(Context context, List<TeamMatch> list) {
        super(context, R.layout.team_rank_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.team_rank_list_item, null);
        }

        TeamMatch data = mList.get(position);

        TextView rankTxt = (TextView) row.findViewById(R.id.rankTxt);
        ImageView teamLogoImg = (ImageView) row.findViewById(R.id.teamLogoImg);
        TextView teamNameTxt = (TextView) row.findViewById(R.id.teamNameTxt);
        TextView nomTxt = (TextView) row.findViewById(R.id.nomTxt);
        TextView vfTxt = (TextView) row.findViewById(R.id.vfTxt);
        TextView winTxt = (TextView) row.findViewById(R.id.winTxt);
        TextView tieTxt = (TextView) row.findViewById(R.id.tieTxt);
        TextView loseTxt = (TextView) row.findViewById(R.id.loseTxt);
        TextView scoreTxt = (TextView) row.findViewById(R.id.scoreTxt);
        TextView losePointTxt = (TextView) row.findViewById(R.id.losePointTxt);
        TextView dfTxt = (TextView) row.findViewById(R.id.dfTxt);

        rankTxt.setText(data.getRank()+"");
        teamNameTxt.setText(data.getTeamName());
        Glide.with(mContext).load(data.getTeamLogo()).into(teamLogoImg);
        nomTxt.setText(data.getNom()+"");
        vfTxt.setText(data.getVf()+"");
        winTxt.setText(data.getWin()+"");
        tieTxt.setText(data.getTie()+"");
        loseTxt.setText(data.getLose()+"");
        scoreTxt.setText(data.getScore()+"");
        losePointTxt.setText(data.getLosePoint()+"");
        dfTxt.setText(data.getDf()+"");

        return row;
    }
}
