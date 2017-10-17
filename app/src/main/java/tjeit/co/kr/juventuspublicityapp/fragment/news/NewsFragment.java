package tjeit.co.kr.juventuspublicityapp.fragment.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.NewsAdapter;
import tjeit.co.kr.juventuspublicityapp.data.News;

/**
 * Created by joeun on 2017-10-17.
 */

public class NewsFragment extends Fragment {

    private android.widget.ListView newsListView;
    NewsAdapter mNewsAdapter;
    List<News> newsList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_news, container, false);
        this.newsListView = (ListView) v.findViewById(R.id.newsListView);

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
        mNewsAdapter = new NewsAdapter(getActivity(), newsList);
        newsListView.setAdapter(mNewsAdapter);
    }

}
