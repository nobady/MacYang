package com.macyang.utils

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by bo on 2017/8/28.
 */
object SpUtils {
    /**
     * 保存在手机里的文件名
     */
    val FILE_NAME: String = "MacYang"

    fun putBoolean(context: Context, key: String, value: Boolean) {
        val sp: SharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putBoolean(key, value)
        editor.commit()
    }

    fun getBoolean(context: Context, key: String, value: Boolean): Boolean {
        val sp: SharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)

        return sp.getBoolean(key, value)
    }

    fun getBoolean(context: Context, key: String): Boolean {
        return getBoolean(context, key, false)
    }

    fun putString(context: Context, key: String, value: String) {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putString(key, value)
        editor.commit()
    }

    fun getString(context: Context, key: String, value: String): String {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)

        return sp.getString(key, value)
    }

    fun getString(context: Context, key: String): String {
        return getString(context, key, "")
    }


    fun putInt(context: Context, key: String, value: Int) {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putInt(key, value)
        editor.commit()
    }

    fun getInt(context: Context, key: String, value: Int): Int {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)

        return sp.getInt(key, value)
    }

    fun getInt(context: Context, key: String): Int {
        return getInt(context, key, 0)
    }


    fun putLong(context: Context, key: String, value: Long) {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putLong(key, value)
        editor.commit()
    }

    fun getLong(context: Context, key: String, value: Long): Long {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)

        return sp.getLong(key, value)
    }

    fun getLong(context: Context, key: String): Long {
        return getLong(context, key, 0L)
    }

    fun putFloat(context: Context, key: String, value: Float) {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putFloat(key, value)
        editor.commit()
    }

    fun getFloat(context: Context, key: String, value: Float): Float {
        val sp = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)

        return sp.getFloat(key, value)
    }

    fun getFloat(context: Context, key: String): Float {
        return getFloat(context, key, 0f)
    }
}