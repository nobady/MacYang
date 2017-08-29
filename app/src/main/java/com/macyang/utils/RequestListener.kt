package com.macyang.utils

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.TypeReference
import com.android.volley.VolleyError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.macyang.net.JDResult
import com.ohmerhe.kolley.request.JsonRequest
import org.json.JSONObject
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.*

/**
 * Created by bo on 2017/8/28.
 */
interface RequestListener<in T>{

    fun success(tag: Int, json: String){
//        val arrayOf = arrayOf(T::class.)
//
//        val bean = Gson().fromJson(json, TypeBuilder(arrayOf)) as T
//        val parseObject = JSON.parseObject(json, object : TypeReference<JDResult<T>>() {})
//        success(tag,bean)
    }

     fun success(tag:Int,bean:T)

     fun failed(tag: Int, error: VolleyError)

     fun start()

     fun onFinish()

}