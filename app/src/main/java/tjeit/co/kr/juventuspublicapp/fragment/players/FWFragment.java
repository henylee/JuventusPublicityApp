package tjeit.co.kr.juventuspublicapp.fragment.players;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicapp.R;
import tjeit.co.kr.juventuspublicapp.adapter.PlayersAdapter;
import tjeit.co.kr.juventuspublicapp.data.Players;
import tjeit.co.kr.juventuspublicapp.util.ContextUtil;

/**
 * Created by joeun on 2017-10-17.
 */

public class FWFragment extends Fragment {

    PlayersAdapter mPlayers;
    List<Players> playersList = new ArrayList<>();
    private android.widget.ListView fwListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_fw, container, false);
        this.fwListView = (ListView) v.findViewById(R.id.fwListView);

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
        playersList.addAll(ContextUtil.FWPlayers);
        mPlayers = new PlayersAdapter(getActivity(), playersList);
        fwListView.setAdapter(mPlayers);
    }

}
