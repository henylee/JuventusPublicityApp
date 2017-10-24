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

import tjeit.co.kr.juventuspublicityapp.R;

/**
 * Created by joeun on 2017-10-17.
 */

public class MovieNewsFragment extends Fragment {

    private boolean interceptPlay = true;

    public static YouTubePlayer youtubePlayer;
    final String serverKey = "AIzaSyC6a9PrdiwmDdTB_nAlMfnrPaE80sxDcHA";
    private com.codewaves.youtubethumbnailview.ThumbnailView thumbnail;
    private android.widget.GridView youtubeThumbnail;
    private LinearLayout youtubeLink;

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

        ThumbnailLoader.initialize(serverKey);
        ThumbnailLoader.initialize().setVideoInfoDownloader(new OembedVideoInfoDownloader());

        thumbnail.loadThumbnail("https://www.youtube.com/watch?v=xFLpMnfvUxc");

        thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubeLink.setVisibility(View.VISIBLE);
                YouTubePlayerSupportFragment supportFragment = (YouTubePlayerSupportFragment) (getChildFragmentManager().findFragmentById(R.id.youtubeFrag));
                supportFragment.initialize(serverKey, new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youtubePlayer = youTubePlayer;
                        youtubePlayer.cueVideo("xFLpMnfvUxc");

                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                });
            }
        });

    }

}
