package com.macyang

import android.os.Bundle
import android.os.Handler
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.macyang.utils.SpUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home          -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard     -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_cook_book     -> {
                message.setText(R.string.cook_book)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        textSpUtils()
    }

    private fun textSpUtils() {
        SpUtils.putBoolean(this, "boo", true)
        SpUtils.putInt(this, "int", 123)
        SpUtils.putFloat(this, "float", 12.12f)
        SpUtils.putLong(this, "long", 1000000000000L)
        SpUtils.putString(this, "string", "详情参见")

        Handler().postDelayed(Runnable {
            kotlin.run {
                message.setText(getContent())
            }
        }, 3000)
    }

    private fun getContent(): String {
        val sb = StringBuffer()
        val boolean = SpUtils.getBoolean(this, "boo")
        val int = SpUtils.getInt(this, "int")
        val float = SpUtils.getFloat(this, "float")
        val long = SpUtils.getLong(this, "long")
        val string = SpUtils.getString(this, "string")
        sb.append(boolean).append(" ").append(int).append(" ").append(float).append(" ").append(long).append(" ").append(string)
        return sb.toString()
    }


}
