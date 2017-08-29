package com.macyang.base

import com.android.volley.Request
import java.lang.ref.WeakReference

/**
 * Created by tengfei.lv on 2017/8/28.
 */
open class BasePresenter<V:BaseView> {

    private var views: WeakReference<V>? = null
    val requestList: ArrayList<Request<ByteArray>> = ArrayList()

    fun attachView(view: V) {
        views = WeakReference(view)
    }

    /**
     * 退出页面时会调用
     */
    fun detachView() {
        views?.let {
            it.clear()
            views = null
        }
        /*取消网络请求操作*/
        requestList.forEach {
            it.cancel()
        }
    }

    fun getView(): V? {
        return views?.get()
    }
}