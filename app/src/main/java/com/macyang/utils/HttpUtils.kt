package com.macyang.utils

import com.alibaba.fastjson.JSON
import com.android.volley.Request
import com.ohmerhe.kolley.request.Http

/**
 * Created by bo on 2017/8/28.
 */
object HttpUtils {
    /**
     * @desc get请求
     * @param requestUrl 请求地址
     * @param map 参数
     * @param listener 请求结果回调
     * @param what 用于区分哪次请求
     */
    inline fun <reified T> getRequest(requestUrl: String, map: Map<String, String>, listener: RequestListener<T>,
        what: Int): Request<ByteArray> {
        return Http.get {
            url = requestUrl
            headers {
                "Accept" - "application/json"
                "Content-Type" - "application/json"
            }

            tag = what

            map.forEach {
                params {
                    it.key - it.value
                }
            }

            onStart {
                listener.start()
            }

            onSuccess { bytes ->
                val bean = JSON.parseObject(String(bytes), T::class.java)
                listener.success(what, bean)
            }

            onFail { error ->
                listener.failed(what, error)
            }

            onFinish {
                listener.onFinish()
            }
        }
    }

    /**
     * @desc post请求
     * @param requestUrl 请求地址
     * @param map 参数
     * @param listener 请求结果回调
     * @param what 用于区分哪次请求
     */
    inline fun <reified T> postRequest(requestUrl: String, map: Map<String, String>, listener: RequestListener<T>,
        what: Int) {
        Http.post {
            url = requestUrl
            headers {
                "Accept" - "application/json"
                "Content-Type" - "application/json"
            }
            tag = what

            map.forEach {
                params {
                    it.key - it.value
                }
            }

            onStart {
                listener.start()
            }

            onSuccess { bytes ->
                val bean = JSON.parseObject(String(bytes), T::class.java)
                listener.success(what, bean)
            }

            onFail { error ->
                listener.failed(what, error)
            }

            onFinish {
                listener.onFinish()
            }
        }
    }
}