package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CountriesFragmentAdapter extends FragmentStateAdapter {

    public CountriesFragmentAdapter(FragmentManager supportFragmentManager, Lifecycle lifecycle) {
        super(supportFragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0:
                fragment=IndiaFragment.newInstance();
                break;
            case 1:
                fragment=FranceFragment.newInstance();
                break;
            case 2:
                fragment=ItalyFragment.newInstance();
                break;
            default:fragment=null;
            break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
