package com.example.digdig.swipeviewna6.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by digdig on 17-06-01.
 */

public class PagerAdapter extends FragmentPagerAdapter {
   private String tabTitle[] = {"Tab-A","Tab-B","Tab-C",};
    public PagerAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        switch (position)
        {
            case 0: fragment = new FragmentA();break;
            case 1: fragment = new FragmentB();break;
            case 2: fragment = new FragmentC();break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }


}
