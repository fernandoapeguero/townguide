package com.fernandoapeguero.townguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        FragmentPager pagerAdapter = new FragmentPager(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        TabLayout tabers = (TabLayout) findViewById(R.id.tab_layout);
        tabers.setupWithViewPager(viewPager);

  }

}
