package tjeit.co.kr.juventuspublicityapp;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {

    private android.support.v4.widget.DrawerLayout naviMenu;
    private android.widget.LinearLayout newsLayOut;
    private LinearLayout newsBtn;
    boolean news = false;
    private LinearLayout playerBtn;
    private LinearLayout playerLayout;
    boolean players = false;
    private LinearLayout matchBtn;
    private LinearLayout matchLayout;
    boolean match = false;
    private LinearLayout myPagerBtn;
    private LinearLayout myPagerLayout;
    boolean mypager = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomActionBar();

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        hamburgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naviMenu.openDrawer(GravityCompat.START);
            }
        });
        newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!news) {
                    news = true;
                    newsLayOut.setVisibility(View.VISIBLE);
                } else {
                    news = false;
                    newsLayOut.setVisibility(View.GONE);
                }
            }
        });
        playerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!players) {
                    players = true;
                    playerLayout.setVisibility(View.VISIBLE);
                } else {
                    players = false;
                    playerLayout.setVisibility(View.GONE);
                }
            }
        });
        matchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!match) {
                    match = true;
                    matchLayout.setVisibility(View.VISIBLE);
                } else {
                    match = false;
                    matchLayout.setVisibility(View.GONE);
                }
            }
        });
        myPagerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mypager) {
                    mypager = true;
                    myPagerLayout.setVisibility(View.VISIBLE);
                } else {
                    mypager = false;
                    myPagerLayout.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.naviMenu = (DrawerLayout) findViewById(R.id.naviMenu);
        this.myPagerLayout = (LinearLayout) findViewById(R.id.myPagerLayout);
        this.myPagerBtn = (LinearLayout) findViewById(R.id.myPagerBtn);
        this.matchLayout = (LinearLayout) findViewById(R.id.matchLayout);
        this.matchBtn = (LinearLayout) findViewById(R.id.matchBtn);
        this.playerLayout = (LinearLayout) findViewById(R.id.playerLayout);
        this.playerBtn = (LinearLayout) findViewById(R.id.playerBtn);
        this.newsLayOut = (LinearLayout) findViewById(R.id.newsLayOut);
        this.newsBtn = (LinearLayout) findViewById(R.id.newsBtn);

    }
}
