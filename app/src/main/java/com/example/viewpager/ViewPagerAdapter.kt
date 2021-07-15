package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private var fragmentList: ArrayList<Fragment> = ArrayList() // ArrayList where fragments are hold


    //Method that returns the position of fragments in the list
    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)

    }
    //Method that returns the number of fragments in the list
    override fun getCount(): Int {
        return fragmentList.size
}

    //Method that adds a new fragment to the list
    fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)

    }
}