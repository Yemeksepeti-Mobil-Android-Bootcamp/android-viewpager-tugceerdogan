package com.example.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.afollestad.viewpagerdots.DotsIndicator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager // initialize viewpager
    private lateinit var dotsIndicator : DotsIndicator // initialize viewpager indicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items()// matching initialized items and components in xml

        setupViewPager(viewPager)//setting up viewpager on page

    }

    private fun items() {
        viewPager = findViewById(R.id.viewPager)
        dotsIndicator  =findViewById(R.id.dotsIndicator)
    }


    private fun setupViewPager(viewpager: ViewPager) {

        var adapter = ViewPagerAdapter(supportFragmentManager)//which controls the fragments to be shown on page swipes

        //Adding the desired fragments to the adapter in order
        adapter.addFragment(FirstFragment())
        adapter.addFragment(SecondFragment())
        adapter.addFragment(ThirdFragment())

        viewPager.setPageTransformer(true, DepthPageTransformer())// add animation page transitions

        viewpager.adapter = adapter//adapting the adapter to which fragments are attached to the viewpager

        dotsIndicator.attachViewPager(viewPager)//attaching the view pager to the viewpager indicator

    }

}
