package com.fernandoapeguero.townguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GalleryInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
       getSupportFragmentManager().beginTransaction().replace(R.id.container,new GalleryInfoFragment()).commit();

    }
}
