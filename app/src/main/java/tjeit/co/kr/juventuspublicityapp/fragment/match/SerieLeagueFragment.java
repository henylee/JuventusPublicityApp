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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.data.Match;

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
    private android.widget.LinearLayout matchLayout;
    private LinearLayout notMatchLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_serie, container, false);
        this.notMatchLayout = (LinearLayout) v.findViewById(R.id.notMatchLayout);
        this.matchLayout = (LinearLayout) v.findViewById(R.id.matchLayout);
        this.awayTeamNameTxt = (TextView) v.findViewById(R.id.awayTeamNameTxt);
        this.awayTeamImg = (ImageView) v.findViewById(R.id.awayTeamImg);
        this.timeTxt = (TextView) v.findViewById(R.id.timeTxt);
        this.homeTeamNameTxt = (TextView) v.findViewById(R.id.homeTeamNameTxt);
        this.homeTeamImg = (ImageView) v.findViewById(R.id.homeTeamImg);
        this.appBar = (AppBarLayout) v.findViewById(R.id.appBar);
        this.calendarView = (HorizontalCalendarView) v.findViewById(R.id.calendarView);

        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 8);
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
                Calendar tempCalendar=Calendar.getInstance();
                tempCalendar.setTime(date);
                Match showMatch = null;
                for (Match match : matchList) {
                    if (match.getDateTime().get(Calendar.DAY_OF_MONTH) == tempCalendar.get(Calendar.DAY_OF_MONTH) &&
                            match.getDateTime().get(Calendar.MONTH)==tempCalendar.get(Calendar.MONTH)
                            &&match.getDateTime().get(Calendar.YEAR)==tempCalendar.get(Calendar.YEAR)) {
                        showMatch = match;
                    }
                }

                if (showMatch != null) {
                    matchLayout.setVisibility(View.VISIBLE);
                    notMatchLayout.setVisibility(View.GONE);
                    homeTeamNameTxt.setText(showMatch.getHomeTeamName());
                    Glide.with(getActivity()).load(showMatch.getHomeTeamImg()).into(homeTeamImg);
                    awayTeamNameTxt.setText(showMatch.getAwayTeamName());
                    Glide.with(getActivity()).load(showMatch.getAwayTeamImg()).into(awayTeamImg);
                    SimpleDateFormat timeSdf = new SimpleDateFormat("a h:mm", Locale.KOREA);
                    String str = timeSdf.format(showMatch.getDateTime().getTime());
                    timeTxt.setText(str);
                }
                else {
                    matchLayout.setVisibility(View.GONE);
                    notMatchLayout.setVisibility(View.VISIBLE);
                }

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

                    Calendar tempCal = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일", Locale.KOREA);
                    String dateStr = compDate.text();
                    tempCal.setTime(sdf.parse(dateStr));

                    Element status = info.select(".status").first();
                    Calendar tempCal2 = Calendar.getInstance();
                    SimpleDateFormat timeSdf = new SimpleDateFormat("a h:mm", Locale.KOREA);
                    String timeStr = status.text();

                    if (!timeStr.equals("—")) {
                        tempCal2.setTime(timeSdf.parse(timeStr));
                        Log.d("timeStr", timeSdf.format(tempCal2.getTime()));
                    }

                    tempCal.set(Calendar.HOUR_OF_DAY, tempCal2.get(Calendar.HOUR_OF_DAY));
                    tempCal.set(Calendar.MINUTE, tempCal2.get(Calendar.MINUTE));

//                    tempCal에 경기 일시 정보 저장

                    Element homeSpan = info.select("span").first();

                    Element awaySpan = info.select("span").get(1);
                    Element homeImg = info.select("img").first();

                    String homeImgURL = homeImg.attr("src");
                    Log.d("homeURL", homeImgURL);

                    Element awayImg = info.select("img").get(1);

                    String awayImgURL = awayImg.attr("src");

                    Match tempMatch = new Match();
                    tempMatch.setDateTime(tempCal);
                    tempMatch.setHomeTeamImg(homeImgURL);
                    tempMatch.setAwayTeamImg(awayImgURL);
                    tempMatch.setHomeTeamName(homeSpan.text());
                    tempMatch.setAwayTeamName(awaySpan.text());

                    matchList.add(tempMatch);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return result;
        }

        @Override
        protected void onPostExecute(Map<String, String> map) {

        }

    }

}
