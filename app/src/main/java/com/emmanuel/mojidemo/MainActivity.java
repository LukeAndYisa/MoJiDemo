package com.emmanuel.mojidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private IndexHorizontalScrollView indexHorizontalScrollView;
    private Today24HourView today24HourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        indexHorizontalScrollView = (IndexHorizontalScrollView)findViewById(R.id.indexHorizontalScrollView);
        today24HourView = (Today24HourView)findViewById(R.id.today24HourView);
        indexHorizontalScrollView.setToday24HourView(today24HourView);
    }
}
