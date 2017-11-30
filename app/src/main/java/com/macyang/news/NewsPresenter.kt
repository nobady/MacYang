package com.macyang.news

import com.macyang.base.BasePresenter
import com.macyang.bean.NewsBean
import com.macyang.net.InterfaceManager
import com.macyang.utils.RequestListener

/**
 * Created by tengfei.lv on 2017/8/29.
 */
class NewsPresenter:BasePresenter<NewsView>() {

    fun getNewsData(listener: RequestListener<NewsBean>) {
        val newsInfo = InterfaceManager.getNewsInfo("头条", 0, listener)
        requestList.add(newsInfo)
    }
}