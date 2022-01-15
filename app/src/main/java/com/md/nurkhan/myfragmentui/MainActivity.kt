package com.md.nurkhan.myfragmentui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val viewPager2: ViewPager2 = findViewById(R.id.view_pager2);

        val fragments: ArrayList<Fragment> = arrayListOf(
            FragmentOne(),FragmentTwo(),FragmentTree()
        )

        val adapter = ViewPagerAdapter(fragments, this)
        viewPager2.adapter = adapter


        }
}