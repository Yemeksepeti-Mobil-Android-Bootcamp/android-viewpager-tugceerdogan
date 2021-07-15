package com.example.viewpager

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var loginButton = findViewById<Button>(R.id.login_button)


        setupViewPager(viewPager)

        loginButton.setOnClickListener {

        }

    }

    private fun setupViewPager(viewpager: ViewPager) {
        var adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FirstFragment())
        adapter.addFragment(SecondFragment())
        adapter.addFragment(ThirdFragment())


        viewpager.adapter = adapter
    }

}
