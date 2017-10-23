package tjeit.co.kr.juventuspublicityapp.fragment.match;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.data.Match;
import tjeit.co.kr.juventuspublicityapp.data.TeamMatch;

/**
 * Created by joeun on 2017-10-17.
 */

public class SerieLeagueFragment extends Fragment {

    List<Match> matchList = new ArrayList<>();
    private devs.mulham.horizontalcalendar.HorizontalCalendarView calendarView;
    private HorizontalCalendar horizontalCalendar;
    Date date;
    private android.support.design.widget.AppBarLayout appBar;
    private android.widget.ImageView homeTeamImg;
    private android.widget.TextView homeTeamNameTxt;
    private android.widget.TextView timeTxt;
    private android.widget.ImageView awayTeamImg;
    private android.widget.TextView awayTeamNameTxt;
    private android.widget.TextView notMatchTxt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_serie, container, false);
        this.notMatchTxt = (TextView) v.findViewById(R.id.notMatchTxt);
        this.awayTeamNameTxt = (TextView) v.findViewById(R.id.awayTeamNameTxt);
        this.awayTeamImg = (ImageView) v.findViewById(R.id.awayTeamImg);
        this.timeTxt = (TextView) v.findViewById(R.id.timeTxt);
        this.homeTeamNameTxt = (TextView) v.findViewById(R.id.homeTeamNameTxt);
        this.homeTeamImg = (ImageView) v.findViewById(R.id.homeTeamImg);
        this.appBar = (AppBarLayout) v.findViewById(R.id.appBar);
        this.calendarView = (HorizontalCalendarView) v.findViewById(R.id.calendarView);

        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 7);
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -2);
        horizontalCalendar = new HorizontalCalendar.Builder(v, R.id.calendarView).startDate(startDate.getTime()).endDate(endDate.getTime()).datesNumberOnScreen(5).dayNameFormat("EEE").dayNumberFormat("dd").monthFormat("MMM").textSize(14f, 24f, 14f).showDayName(true).showMonthName(true).textColor(Color.LTGRAY, Color.WHITE).selectedDateBackground(Color.TRANSPARENT).build();

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setValues();
        setupEvents();
    }

    private void setupEvents() {
        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
            @Override
            public void onDateSelected(Date date, int position) {

            }
        });
    }

    private void setValues() {
        GetScheduleTask task = new SerieLeagueFragment.GetScheduleTask();
        task.execute();
    }

    private class GetScheduleTask extends AsyncTask<Void, Void, Map<String,String>> {

        @Override
        protected Map<String, String> doInBackground(Void... params) {
            Map<String,String> result = new HashMap<String,String>();
            try {
                Document doc = Jsoup.connect("http://www.goal.com/kr/fixtures/team/%EC%9C%A0%EB%B2%A4%ED%88%AC%EC%8A%A4/1242?ICID=RE_TN_90").timeout(10000).get();

                Elements infos = doc.select(".match-table");

                for (Element info : infos) {
                    Element compDate = info.select(".comp-date").first();
                    Element status = info.select(".status").first();
                    Element homeSpan = info.select("span").first();
                    Element awaySpan = info.select("span").get(1);
                    Element homeImg = info.select("img").first();
                    Element awayImg = info.select("img").get(1);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return result;
        }

        @Override
        protected void onPostExecute(Map<String, String> map) {

        }

    }

}
