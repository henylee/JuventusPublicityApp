package tjeit.co.kr.juventuspublicityapp.fragment.players;

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
import tjeit.co.kr.juventuspublicityapp.adapter.PlayersAdapter;
import tjeit.co.kr.juventuspublicityapp.data.Players;
import tjeit.co.kr.juventuspublicityapp.util.ContextUtil;
import tjeit.co.kr.juventuspublicityapp.util.GlobalData;

/**
 * Created by joeun on 2017-10-17.
 */

public class MFFragment extends Fragment {

    PlayersAdapter mPlayers;
    List<Players> playersList = new ArrayList<>();
    private android.widget.ListView mfListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_mf, container, false);
        this.mfListView = (ListView) v.findViewById(R.id.mfListView);
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
        playersList.addAll(ContextUtil.MFPlayers);
        mPlayers = new PlayersAdapter(getActivity(), playersList);
        mfListView.setAdapter(mPlayers);
    }

}
