package tjeit.co.kr.juventuspublicityapp.fragment.match;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.TeamMatchAdapter;
import tjeit.co.kr.juventuspublicityapp.data.TeamMatch;
import tjeit.co.kr.juventuspublicityapp.util.ContextUtil;

/**
 * Created by Administrator on 2017-10-18.
 */

public class TeamRankFragment extends Fragment {

    TeamMatchAdapter mTeam;
    List<TeamMatch> playerList=new ArrayList<>();
    private android.widget.ListView teamListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_team_rank, container, false);
        this.teamListView = (ListView) v.findViewById(R.id.teamListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setValues();
        setupEvents();
    }

    private void setupEvents() {

    }

    private void setValues() {
        playerList.addAll(ContextUtil.Ranking);
        mTeam = new TeamMatchAdapter(getActivity(), playerList);
        teamListView.setAdapter(mTeam);
    }

}
