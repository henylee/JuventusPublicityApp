package tjeit.co.kr.juventuspublicityapp.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.codewaves.youtubethumbnailview.ThumbnailLoader;
import com.codewaves.youtubethumbnailview.ThumbnailView;
import com.codewaves.youtubethumbnailview.downloader.OembedVideoInfoDownloader;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.adapter.GridViewAdapter;
import tjeit.co.kr.juventuspublicityapp.data.Photo;
import tjeit.co.kr.juventuspublicityapp.util.ContextUtil;

/**
 * Created by joeun on 2017-10-17.
 */

public class MovieNewsFragment extends Fragment {

    private boolean interceptPlay = true;

    public static YouTubePlayer youtubePlayer;
    final String serverKey = "AIzaSyC6a9PrdiwmDdTB_nAlMfnrPaE80sxDcHA";
    private android.widget.GridView youtubeThumbnail;
    private LinearLayout youtubeLink;
    GridViewAdapter mGrid;
    List<Photo> mListPriview = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_movie, container, false);
        this.youtubeLink = (LinearLayout) v.findViewById(R.id.youtubeLink);
        this.youtubeThumbnail = (GridView) v.findViewById(R.id.youtubeThumbnail);

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
        mListPriview.addAll(ContextUtil.priview);
        mGrid = new GridViewAdapter(getActivity(), mListPriview);
        youtubeThumbnail.setAdapter(mGrid);

    }

}
