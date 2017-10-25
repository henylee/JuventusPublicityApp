package tjeit.co.kr.juventuspublicapp.fragment.players;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicapp.R;
import tjeit.co.kr.juventuspublicapp.adapter.PlayersAdapter;
import tjeit.co.kr.juventuspublicapp.data.Players;

/**
 * Created by joeun on 2017-10-17.
 */

public class ManagerFragment extends Fragment {

    PlayersAdapter mPlayers;
    List<Players> mPlayersList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_manager, container, false);
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
