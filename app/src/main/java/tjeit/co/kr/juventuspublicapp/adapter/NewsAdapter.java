package tjeit.co.kr.juventuspublicapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import tjeit.co.kr.juventuspublicapp.R;
import tjeit.co.kr.juventuspublicapp.data.News;

/**
 * Created by joeun on 2017-10-17.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    Context mContext;
    List<News> mList;
    LayoutInflater inf;

    public NewsAdapter(Context context, List<News> list) {
        super(context, R.layout.news_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row==null) {
            row = inf.inflate(R.layout.news_list_item, null);
        }

        News data = mList.get(position);

        ImageView newsImg = (ImageView) row.findViewById(R.id.newsImg);
        TextView titleTxt = (TextView) row.findViewById(R.id.titleTxt);
        TextView discriptionTxt = (TextView) row.findViewById(R.id.discriptionTxt);

        Glide.with(mContext).load(data.getImageURL()).into(newsImg);
        titleTxt.setText(data.getTitle());
        discriptionTxt.setText(data.getContent());

        if (discriptionTxt.length()>100) {
            String description = data.getContent().substring(0,100)+"... <font color=#000000></font>";
            discriptionTxt.setText(Html.fromHtml(description));
        }

        return row;
    }
}
