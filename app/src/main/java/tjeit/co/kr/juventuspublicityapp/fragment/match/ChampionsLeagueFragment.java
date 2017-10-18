package tjeit.co.kr.juventuspublicityapp.fragment.match;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Calendar;
import java.util.Date;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.HorizontalCalendarListener;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import tjeit.co.kr.juventuspublicityapp.R;

/**
 * Created by joeun on 2017-10-17.
 */

public class ChampionsLeagueFragment extends Fragment {

    private devs.mulham.horizontalcalendar.HorizontalCalendarView calendarView;
    private android.support.design.widget.AppBarLayout appBar;
    private HorizontalCalendar horizontalCalendar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_champions, container, false);
        this.appBar = (AppBarLayout) v.findViewById(R.id.appBar);
        this.calendarView = (HorizontalCalendarView) v.findViewById(R.id.calendarView);

        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 1);
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -1);
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

    }

}
