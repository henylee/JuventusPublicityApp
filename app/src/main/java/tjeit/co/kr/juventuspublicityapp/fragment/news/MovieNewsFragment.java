package tjeit.co.kr.juventuspublicityapp.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
    GridViewAdapter mGrid;
    List<Photo> mListPriview = new ArrayList<>();
    private LinearLayout youtubeLink;
    private android.widget.ImageView backBtn;
    private android.widget.TextView titleTxt;
    private android.widget.TextView detailTxt;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_movie, container, false);
        this.detailTxt = (TextView) v.findViewById(R.id.detailTxt);
        this.titleTxt = (TextView) v.findViewById(R.id.titleTxt);
        this.backBtn = (ImageView) v.findViewById(R.id.backBtn);
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
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubeThumbnail.setVisibility(View.VISIBLE);
                youtubeLink.setVisibility(View.GONE);
            }
        });

    }

    private void setValues() {
        mListPriview.addAll(ContextUtil.priview);
        mGrid = new GridViewAdapter(getActivity(), mListPriview, this);
        youtubeThumbnail.setAdapter(mGrid);

        YouTubePlayerSupportFragment supportFragment = (YouTubePlayerSupportFragment) (getChildFragmentManager().findFragmentById(R.id.youtubeFrag));
        supportFragment.initialize(serverKey, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youtubePlayer = youTubePlayer;

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        });
    }

    public void showMovie(final Photo data) {
        youtubeThumbnail.setVisibility(View.GONE);
        youtubeLink.setVisibility(View.VISIBLE);

        youtubePlayer.cueVideo(data.getThumNailImg().split("=")[1]);
        titleTxt.setText(data.getTitleText());
        detailTxt.setText(data.getDetailDescrip());
    }

}
