package com.example.ogan.tlcc;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ogan on 3/27/17.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
    private  String[] tabtitle = new String[] {"tab_1", "tab_2", "tab_3", "tab_4", "tab_5"};
    Context context;
    private int pageCount = 5;

    public SimpleFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentDemo fragmentDemo = new FragmentDemo();
        return fragmentDemo;
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
