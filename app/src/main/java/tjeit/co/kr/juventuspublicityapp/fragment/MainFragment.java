package tjeit.co.kr.juventuspublicityapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.fragment.match.MatchFragment;
import tjeit.co.kr.juventuspublicityapp.fragment.news.AllNewsFragment;
import tjeit.co.kr.juventuspublicityapp.fragment.players.AllPlayerFragment;

/**
 * Created by joeun on 2017-10-16.
 */

public class MainFragment extends Fragment {

    private com.ogaclejapan.smarttablayout.SmartTabLayout viewpagertab;
    public android.support.v4.view.ViewPager viewpager;

    FragmentPagerItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_main, container, false);
        this.viewpager = (ViewPager) v.findViewById(R.id.viewpager);
        this.viewpagertab = (SmartTabLayout) v.findViewById(R.id.viewpagertab);
        adapter = new FragmentPagerItemAdapter(getActivity().getSupportFragmentManager(), FragmentPagerItems.with(getActivity()).
                add(R.string.titleA, AllNewsFragment.class).add(R.string.titleB, AllPlayerFragment.class).add(R.string.titleC, MatchFragment.class).
                add(R.string.titleD, MemberShipFragment.class).add(R.string.titleE, ShopFragment.class).create());
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(5);
        viewpagertab.setViewPager(viewpager);
        return v;
    }

    public void changeFrag(int rootPage, int innerPage) {
        viewpager.setCurrentItem(rootPage);
        Log.d("viewpager 사이즈", adapter.getCount() + "개");
        if (rootPage == 0) {

            ((AllNewsFragment) adapter.getPage(rootPage)).viewpager.setCurrentItem(innerPage);
        }
        else if (rootPage == 1) {
            ((AllPlayerFragment) adapter.getPage(rootPage)).viewpager.setCurrentItem(innerPage);
        }

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
