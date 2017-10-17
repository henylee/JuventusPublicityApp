package tjeit.co.kr.juventuspublicityapp.fragment.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.NewsAdapter;
import tjeit.co.kr.juventuspublicityapp.data.News;

/**
 * Created by joeun on 2017-10-17.
 */

public class AllNewsFragment extends Fragment {

    private com.ogaclejapan.smarttablayout.SmartTabLayout viewpagertab;
    private android.support.v4.view.ViewPager viewpager;
    NewsAdapter mAdapter;
    List<News> newsList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_allnews, container, false);
        this.viewpager = (ViewPager) v.findViewById(R.id.viewpager);
        this.viewpagertab = (SmartTabLayout) v.findViewById(R.id.viewpagertab);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(getActivity().getSupportFragmentManager(), FragmentPagerItems.with(getActivity()).
                        add(R.string.titleA1, NewsFragment.class).add(R.string.titleA2, PhotoNewsFragment.class).add(R.string.titleA3, MovieNewsFragment.class).create());
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(3);
        viewpagertab.setViewPager(viewpager);

        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        setValues();
        setupEvents();
    }

    private void setupEvents() {

    }

    private void setValues() {
        mAdapter = new NewsAdapter(getActivity(), newsList);
    }

}
