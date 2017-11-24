package com.alhamdulillah.maulvi67.finalproject;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayHomeAsUpEnabled(true);

    }
}
