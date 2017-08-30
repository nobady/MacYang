package com.macyang.utils

import com.android.volley.VolleyError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by bo on 2017/8/28.
 */
interface RequestListener<in T>{

     fun success(tag:Int, bean: T)

     fun failed(tag: Int, error: VolleyError)

     fun start()

     fun onFinish()

}