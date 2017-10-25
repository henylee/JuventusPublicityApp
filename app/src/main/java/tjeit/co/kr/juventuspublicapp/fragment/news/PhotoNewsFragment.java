package tjeit.co.kr.juventuspublicapp.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicapp.R;
import tjeit.co.kr.juventuspublicapp.adapter.PhotoNewsAdapter;
import tjeit.co.kr.juventuspublicapp.data.Photo;

/**
 * Created by joeun on 2017-10-17.
 */

public class PhotoNewsFragment extends Fragment {

    PhotoNewsAdapter mPhotoNews;
    List<Photo> photoList = new ArrayList<>();
    private GridView photoNewsListView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_photo, container, false);
        this.photoNewsListView = (GridView) v.findViewById(R.id.photoNewsListView);

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
        mPhotoNews = new PhotoNewsAdapter(getActivity(), photoList);
        photoNewsListView.setAdapter(mPhotoNews);
    }

}
