package tjeit.co.kr.juventuspublicityapp.fragment.match;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jsoup.nodes.Element;
import java.util.Map;

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

        GetTeamRankTask task = new GetTeamRankTask();
        task.execute();

        mTeam = new TeamMatchAdapter(getActivity(), playerList);
        teamListView.setAdapter(mTeam);
    }

    private class GetTeamRankTask extends AsyncTask<Void, Void, Map<String,String>> {


        @Override
        protected Map<String, String> doInBackground(Void... params) {
            Map<String,String> result = new HashMap<String,String>();
            try {

                Document doc = Jsoup.connect("http://m.sports.naver.com/wfootball/record/index.nhn?category=seria&tab=team").timeout(10000).get();
                Elements scriptElements = doc.getElementsByTag("script");

                for (Element el : scriptElements) {
                    if (el.toString().contains("var teamRecordAsJson")) {
                        String whole = el.dataNodes().get(0).getWholeData();
                        String var = whole.split(";")[0];
                        String jsonString = var.split(" = ")[1];
                        System.out.println(jsonString);

                        JSONObject jsonObject = new JSONObject(jsonString);
//                        스크립트를 분석해서 JSONObject로 가공

//                        가공된 JSON 파싱
                        JSONArray recordList = jsonObject.getJSONArray("recordList");

                        playerList.clear();
                        for (int i = 0 ; i < recordList.length() ; i++) {
                            playerList.add(TeamMatch.getTeamMatchFromJson(recordList.getJSONObject(i)));
                        }

                        mTeam.notifyDataSetChanged();
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return result;
        }

        @Override
        protected void onPostExecute(Map<String, String> map) {

        }
    }

}
