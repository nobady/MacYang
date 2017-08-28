package com.macyang.utils

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
    fun getRequest(requestUrl: String, map: Map<String, String>, listener: RequestListener, what: Int) {
        Http.get {
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

            onSuccess { bytes ->
                listener.success(what, bytes)
            }

            onFail { error ->
                listener.failed(what, error)
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
    fun postRequest(requestUrl: String, map: Map<String, String>, listener: RequestListener, what: Int) {
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
            onSuccess { bytes ->
                listener.success(what, bytes)
            }

            onFail { error ->
                listener.failed(what, error)
            }
        }
    }
}