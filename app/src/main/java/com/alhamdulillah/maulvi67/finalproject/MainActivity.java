package com.alhamdulillah.maulvi67.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickProfile(View view) {
        Intent intProfile = new Intent(MainActivity.this,Profile.class);
        startActivity(intProfile);
    }


    public void clickAcara(View view) {
        Intent intAcara = new Intent(MainActivity.this,Acara.class);
        startActivity(intAcara);
    }
}
