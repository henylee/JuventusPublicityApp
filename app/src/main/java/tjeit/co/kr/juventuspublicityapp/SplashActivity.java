package tjeit.co.kr.juventuspublicityapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tjeit.co.kr.juventuspublicityapp.util.GlobalData;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1500);

    }

    @Override
    public void setValues() {
        GlobalData.addGK();
        GlobalData.addDF();
        GlobalData.addMF();
        GlobalData.addFW();
        GlobalData.addLease();
        GlobalData.addMovie();
        GlobalData.addNews();
//        GlobalData.allTeamRanking();
    }

    @Override
    public void bindViews() {

    }
}
