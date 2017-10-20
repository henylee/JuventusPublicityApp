package tjeit.co.kr.juventuspublicityapp.fragment.match;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.util.ServerUtil;

/**
 * Created by joeun on 2017-10-17.
 */

public class SerieLeagueFragment extends Fragment {

    private devs.mulham.horizontalcalendar.HorizontalCalendarView calendarView;
    private HorizontalCalendar horizontalCalendar;
    Date date;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_serie, container, false);
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

        GetScheduleTask task = new GetScheduleTask();
        task.execute();

    }

    private class GetScheduleTask extends AsyncTask<Void, Void, Map<String,String>> {

        private String numberType;

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

                    Log.d("홈팀", homeSpan.text());
                    Log.d("원정팀", awaySpan.text());
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
