package com.macyang.base

import com.android.volley.Request
import java.lang.ref.WeakReference

/**
 * Created by tengfei.lv on 2017/8/28.
 */
open class BasePresenter {
    private var views: WeakReference<BaseView>? = null
    val request: List<Request<ByteArray>> = ArrayList()

    fun attachView(view: BaseView) {
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
        request.forEach {
            it.cancel()
        }
    }

    fun getView(): BaseView? {
        return views?.get()
    }

    fun isAttachView(): Boolean {
        return views != null && views?.get() != null
    }
}