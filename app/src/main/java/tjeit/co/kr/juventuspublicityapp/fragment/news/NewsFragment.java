package tjeit.co.kr.juventuspublicityapp.fragment.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.NewsAdapter;
import tjeit.co.kr.juventuspublicityapp.data.News;
import tjeit.co.kr.juventuspublicityapp.util.ContextUtil;

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

        newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                News list = newsList.get(i);

                Intent intent = new Intent(getActivity(), DetailNewsFragment.class);
                intent.putExtra("뉴스내용", list);
                getActivity().startActivity(intent);
            }
        });
    }

    private void setValues() {
        newsList.addAll(ContextUtil.news);
        mNewsAdapter = new NewsAdapter(getActivity(), newsList);
        newsListView.setAdapter(mNewsAdapter);
    }

}
