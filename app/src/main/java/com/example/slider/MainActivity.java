package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //creating object of ViewPager
    ViewPager mViewPagerTorso;

    //creating object of ViewPager
    ViewPager mViewPagerHat;

    //images array
    int[] imagesTorso = {R.drawable.torso1, R.drawable.torso2};


    //images array
    int[] imagesHat = {R.drawable.hat1, R.drawable.hat2};

    //Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapterTorso;

    //Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapterHat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the ViewPager Object
        mViewPagerTorso = (ViewPager)findViewById(R.id.viewPagerMain);

        //Initializing the ViewPager Object
        mViewPagerHat = (ViewPager)findViewById(R.id.viewPagerSecondary);

        //Initializing the ViewPagerAdapter
        mViewPagerAdapterTorso = new ViewPagerAdapter(MainActivity.this, imagesTorso);

        //Initializing the ViewPagerAdapter
        mViewPagerAdapterHat = new ViewPagerAdapter(MainActivity.this, imagesHat);

        //Adding the Adapter to the ViewPager
        mViewPagerTorso.setAdapter(mViewPagerAdapterTorso);

        //Adding the Adapter to the ViewPager
        mViewPagerHat.setAdapter(mViewPagerAdapterHat);


    }





}