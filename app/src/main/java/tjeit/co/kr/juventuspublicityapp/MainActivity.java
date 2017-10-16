package tjeit.co.kr.juventuspublicityapp;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;

public class MainActivity extends BaseActivity {

    private android.support.v4.widget.DrawerLayout naviMenu;

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
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.naviMenu = (DrawerLayout) findViewById(R.id.naviMenu);
    }
}
