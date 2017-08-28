package com.macyang.utils

import com.android.volley.VolleyError

/**
 * Created by bo on 2017/8/28.
 */
interface RequestListener {
    fun success(tag: Int, bytes: ByteArray)

    fun failed(tag: Int, error: VolleyError)
}