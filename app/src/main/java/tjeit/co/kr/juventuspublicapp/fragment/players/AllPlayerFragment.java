package tjeit.co.kr.juventuspublicapp.fragment.players;

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

import tjeit.co.kr.juventuspublicapp.R;

/**
 * Created by joeun on 2017-10-17.
 */

public class AllPlayerFragment extends Fragment {

    private SmartTabLayout viewpagertab;
    public ViewPager viewpager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_allplayer, container, false);
        this.viewpager = (ViewPager) v.findViewById(R.id.viewpager);
        this.viewpagertab = (SmartTabLayout) v.findViewById(R.id.viewpagertab);
        FragmentPagerItemAdapter adapter =
                new FragmentPagerItemAdapter(getChildFragmentManager(), FragmentPagerItems.with(getActivity()).
                        add(R.string.titleB1, ManagerFragment.class).add(R.string.titleB7, StadiumFragment.class).add(R.string.titleB2, GKFragment.class).add(R.string.titleB3, DFFragment.class).
                        add(R.string.titleB4, MFFragment.class).add(R.string.titleB5, FWFragment.class).add(R.string.titleB6, LeaseFragment.class).create());
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(6);
        viewpagertab.setViewPager(viewpager);
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
