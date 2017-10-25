package tjeit.co.kr.juventuspublicapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.List;

import tjeit.co.kr.juventuspublicapp.R;
import tjeit.co.kr.juventuspublicapp.data.Photo;

/**
 * Created by joeun on 2017-10-17.
 */

public class PhotoNewsAdapter extends ArrayAdapter<Photo> {

    Context mContext;
    List<Photo> mList;
    LayoutInflater inf;

    public PhotoNewsAdapter(Context context, List<Photo> list) {
        super(context, R.layout.photo_news_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.photo_news_list_item, null);
        }

        GridView photoNewsListView = (GridView) row.findViewById(R.id.photoNewsListView);

        return row;
    }

    @Override
    public int getCount() {
        return 15;
    }
}
