package com.elcio.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);//esconde linha que fica abaixo da actionbar

        viewPager = findViewById(R.id.viewpager);
        smartTabLayout = findViewById(R.id.viewPagerTab);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add(R.string.bichos, BichosFragment.class)
                        .add(R.string.numeros, NumerosFragment.class)
                        .add(R.string.vogais, VogaisFragment.class)
                        .create()
        );

        viewPager.setAdapter(adapter);

        smartTabLayout.setViewPager(viewPager);



    }
}
