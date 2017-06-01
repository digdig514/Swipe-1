package com.example.digdig.swipeviewna6;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.digdig.swipeviewna6.model.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager;
    PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        viewpager = (ViewPager) findViewById(R.id.ViewPage);
        FragmentManager fragmentManager = getSupportFragmentManager();
        pagerAdapter = new PagerAdapter(fragmentManager);
        viewpager.setAdapter(pagerAdapter);
    }
}
