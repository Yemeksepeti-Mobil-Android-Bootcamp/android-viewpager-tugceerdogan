package com.example.viewpager

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tabViewpager = findViewById<ViewPager>(R.id.viewPager)
        var tabTablayout = findViewById<TabLayout>(R.id.tabLayout)
        var loginButton = findViewById<Button>(R.id.login_button)


        setupViewPager(tabViewpager)


        tabTablayout.setupWithViewPager(tabViewpager)

        loginButton.setOnClickListener {

        }

    }


    private fun setupViewPager(viewpager: ViewPager) {
        var adapter = ViewPagerAdapter(supportFragmentManager)


        adapter.addFragment(FirstFragment(), "First")
        adapter.addFragment(SecondFragment(), "Second")
        adapter.addFragment(ThirdFragment(), "Third")


        viewpager.setAdapter(adapter)
    }

}
