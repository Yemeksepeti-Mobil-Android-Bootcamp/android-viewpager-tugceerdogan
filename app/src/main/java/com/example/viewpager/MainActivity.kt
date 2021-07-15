package com.example.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.afollestad.viewpagerdots.DotsIndicator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var dotsIndicator : DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items()

        setupViewPager(viewPager)


    }

    private fun items() {

        viewPager = findViewById(R.id.viewPager)
        dotsIndicator  =findViewById(R.id.dotsIndicator)
    }


    private fun setupViewPager(viewpager: ViewPager) {

        var adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment())
        adapter.addFragment(SecondFragment())
        adapter.addFragment(ThirdFragment())

        viewPager.setPageTransformer(true, DepthPageTransformer())

        viewpager.adapter = adapter

        dotsIndicator.attachViewPager(viewPager)

    }


}
