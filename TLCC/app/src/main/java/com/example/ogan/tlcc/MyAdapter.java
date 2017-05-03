package com.example.ogan.tlcc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.ogan.tlcc.TabFragment.int_items;

/**
 * Created by ogan on 4/2/17.
 */

public class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new BlogFragment();
            case 2:
                return new MediaFragment();
            case 3:
                return new EventFragment();
            case 4:
                return new ChatFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Blog";
            case 2:
                return "Media";
            case 3:
                return "Events";
            case 4:
                return "Chat";
        }
        return null;
    }
}
