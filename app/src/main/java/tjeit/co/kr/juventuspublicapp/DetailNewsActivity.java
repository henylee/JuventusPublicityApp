package tjeit.co.kr.juventuspublicapp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import tjeit.co.kr.juventuspublicapp.data.News;

public class DetailNewsActivity extends BaseActivity {

    private android.widget.TextView titleTxt;
    private android.widget.ImageView newsImg;
    private android.widget.TextView contentTxt;
    News news = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        Glide.with(mContext).load(news.getImageURL()).into(newsImg);
        titleTxt.setText(news.getTitle());
        contentTxt.setText(news.getContent());
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);

        news = (News) getIntent().getSerializableExtra("뉴스내용");
    }

    @Override
    public void bindViews() {
        this.contentTxt = (TextView) findViewById(R.id.contentTxt);
        this.newsImg = (ImageView) findViewById(R.id.newsImg);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);

    }
}
