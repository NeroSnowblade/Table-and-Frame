package com.fajarmush.tableframelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveFrame1(View view) {
        setContentView(R.layout.frame_layout1);
    }

    public void moveTable(View view) {
        setContentView(R.layout.activity_main);
    }

    public void moveFrame2(View view) {
        setContentView(R.layout.frame_layout2);
    }
}