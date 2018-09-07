package com.android.saket.portfolioapp.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.saket.portfolioapp.views.AboutFragment;
import com.android.saket.portfolioapp.views.ContactFragment;
import com.android.saket.portfolioapp.views.SkillFragment;
import com.android.saket.portfolioapp.views.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {
    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "About";
            case 1: return  "Work";
            case 2: return  "Skill";
            case 3: return  "Contact";
        }
        return super.getPageTitle(position);
    }
}
