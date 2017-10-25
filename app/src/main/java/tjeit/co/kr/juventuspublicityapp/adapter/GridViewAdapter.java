package tjeit.co.kr.juventuspublicityapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codewaves.youtubethumbnailview.ThumbnailLoader;
import com.codewaves.youtubethumbnailview.ThumbnailView;
import com.codewaves.youtubethumbnailview.downloader.OembedVideoInfoDownloader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.data.Photo;
import tjeit.co.kr.juventuspublicityapp.fragment.news.MovieNewsFragment;

/**
 * Created by joeun on 2017-10-24.
 */

public class GridViewAdapter extends ArrayAdapter<Photo> {

    Context mContext;
    List<Photo> mList;
    LayoutInflater inf;
    MovieNewsFragment mnf;

    public GridViewAdapter(Context context, List<Photo> list, MovieNewsFragment movieNewsFrg) {

        super(context, R.layout.gridview_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
        mnf=movieNewsFrg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row=inf.inflate(R.layout.gridview_list_item, null);
        }

        final Photo data = mList.get(position);

        ThumbnailView thumbnail = (ThumbnailView) row.findViewById(R.id.thumbnail);
        TextView matchTxt = (TextView) row.findViewById(R.id.matchTxt);

        final String serverKey = "AIzaSyC6a9PrdiwmDdTB_nAlMfnrPaE80sxDcHA";

        ThumbnailLoader.initialize(serverKey);
        ThumbnailLoader.initialize().setVideoInfoDownloader(new OembedVideoInfoDownloader());

        thumbnail.loadThumbnail(data.getThumNailImg());
        matchTxt.setText(data.getTitleText());

        thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mnf.showMovie(data);
            }
        });

        return row;
    }
}
