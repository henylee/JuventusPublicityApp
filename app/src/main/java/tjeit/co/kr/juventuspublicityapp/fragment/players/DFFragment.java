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

/**
 * Created by joeun on 2017-10-17.
 */

public class DFFragment extends Fragment {

    PlayersAdapter mPlayers;
    List<Players> playersList = new ArrayList<>();
    private android.widget.ListView dfListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_df, container, false);
        this.dfListView = (ListView) v.findViewById(R.id.dfListView);

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
        playersList.addAll(ContextUtil.DFPlayers);
        mPlayers = new PlayersAdapter(getActivity(), playersList);
        dfListView.setAdapter(mPlayers);
    }

}
