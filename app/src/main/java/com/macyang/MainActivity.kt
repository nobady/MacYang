package com.macyang

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.macyang.chat.ChatFragment
import com.macyang.news.NewsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mCurrentFragment: Fragment? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home          -> {
                changeFragment(NewsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard     -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                changeFragment(ChatFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_cook_book     -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        changeFragment(NewsFragment())
    }

    private fun changeFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_layout, fragment)
        if (mCurrentFragment != null) {
            transaction.hide(mCurrentFragment!!)
        }
        transaction.show(fragment)
        transaction.commit()
        mCurrentFragment = fragment
    }


}
