package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {

   private ViewPager2 viewPager;
    private TabLayout tab;
    CountriesFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        viewPager=findViewById(R.id.countriesViewPager);
        adapter=new CountriesFragmentAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapter);
        tab=findViewById(R.id.countriesTabLayout);
        TabLayoutMediator mediator= new TabLayoutMediator(tab, viewPager, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab ta, int position) {
                switch(position){
                    case 0: ta.setText("India");
                    break;
                    case 1:
                        ta.setText("France");
                        break;
                    case 2:
                        ta.setText("Italy");
                        break;
                }
            }
        }); mediator.attach();

    }
}