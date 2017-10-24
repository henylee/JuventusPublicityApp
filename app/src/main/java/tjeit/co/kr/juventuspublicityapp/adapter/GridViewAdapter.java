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

import com.codewaves.youtubethumbnailview.ThumbnailLoader;
import com.codewaves.youtubethumbnailview.downloader.OembedVideoInfoDownloader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.List;

import tjeit.co.kr.juventuspublicityapp.R;
import tjeit.co.kr.juventuspublicityapp.data.Photo;

/**
 * Created by joeun on 2017-10-24.
 */

public class GridViewAdapter extends ArrayAdapter<Photo> {

    Context mContext;
    List<Photo> mList;
    LayoutInflater inf;

    public GridViewAdapter(Context context, List<Photo> list) {

        super(context, R.layout.gridview_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row=inf.inflate(R.layout.gridview_list_item, null);
        }
        YouTubeThumbnailView thumbnail = (YouTubeThumbnailView) row.findViewById(R.id.thumbnail);
        TextView matchTxt = (TextView) row.findViewById(R.id.matchTxt);

        final String serverKey = "AIzaSyC6a9PrdiwmDdTB_nAlMfnrPaE80sxDcHA";

        ThumbnailLoader.initialize(serverKey);
        ThumbnailLoader.initialize().setVideoInfoDownloader(new OembedVideoInfoDownloader());

        thumbnail.loadThumbnail("https://www.youtube.com/watch?v=xFLpMnfvUxc");
        return row;
    }
}
