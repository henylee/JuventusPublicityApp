package tjeit.co.kr.juventuspublicityapp.fragment.match;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.MatchAdapter;
import tjeit.co.kr.juventuspublicityapp.data.Match;

/**
 * Created by joeun on 2017-10-17.
 */

public class SerieLeagueFragment extends Fragment {

    MatchAdapter mMatch;
    List<Match> matchList = new ArrayList<>();
    private devs.mulham.horizontalcalendar.HorizontalCalendarView calendarView;
    private HorizontalCalendar horizontalCalendar;
    Date date;
    private android.support.design.widget.AppBarLayout appBar;
    private android.widget.ListView serieMatchListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_serie, container, false);
        this.serieMatchListView = (ListView) v.findViewById(R.id.serieMatchListView);
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
        mMatch = new MatchAdapter(getActivity(), matchList);
        serieMatchListView.setAdapter(mMatch);
    }

}
