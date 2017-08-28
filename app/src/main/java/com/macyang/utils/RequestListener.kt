package com.macyang.utils

import com.android.volley.VolleyError

/**
 * Created by bo on 2017/8/28.
 */
interface RequestListener<in T> {
    fun success(tag: Int, t: T)

    fun failed(tag: Int, error: VolleyError)

    fun start()

    fun onFinish()
}