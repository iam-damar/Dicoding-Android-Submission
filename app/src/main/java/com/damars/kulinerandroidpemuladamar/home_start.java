package com.damars.kulinerandroidpemuladamar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class home_start extends AppCompatActivity {
    private int loading_time = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_start);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(home_start.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },loading_time);

    }
}