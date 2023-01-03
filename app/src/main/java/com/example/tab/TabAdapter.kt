package com.example.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(fm : FragmentManager, internal var totalTab:Int): FragmentPagerAdapter(fm){
    override fun getCount(): Int {
       return totalTab
    }

    override fun getItem(position: Int): Fragment {
        when (position)
        {
            0->{return FirstFragment()}
            1->{return SecondFragment()}
            else -> return ThirdFragment()
        }
    }
}