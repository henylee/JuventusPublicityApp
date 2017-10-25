package tjeit.co.kr.juventuspublicityapp.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.NewsAdapter;
import tjeit.co.kr.juventuspublicityapp.data.News;

/**
 * Created by joeun on 2017-10-25.
 */

public class DetailNewsFragment extends Fragment {

    private android.widget.TextView titleTxt;
    private android.widget.ImageView newsImg;
    private android.widget.TextView contentTxt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_detail_news, container, false);
        this.contentTxt = (TextView) v.findViewById(R.id.contentTxt);
        this.newsImg = (ImageView) v.findViewById(R.id.newsImg);
        this.titleTxt = (TextView) v.findViewById(R.id.titleTxt);

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

    }

}
