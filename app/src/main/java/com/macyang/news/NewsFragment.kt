package com.macyang.news

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.VolleyError
import com.macyang.R
import com.macyang.base.BaseNetFragment
import com.macyang.bean.NewsBean

/**
 * Created by tengfei.lv on 2017/8/29.
 */
class NewsFragment:BaseNetFragment<NewsView,NewsPresenter,NewsBean>(),NewsView {

    override fun getLayout(): Int {
        return R.layout.fragment_news
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requestData()
    }
    override fun success(tag: Int, t: NewsBean) {

        Log.e("TAG","bean = $t")
    }

    override fun failed(tag: Int, error: VolleyError) {
        Log.e("TAG","e = ${error.message}")
    }

    override fun createPresenter(): NewsPresenter {
        return NewsPresenter()
    }

    override fun requestData() {
        presenter?.getNewsData(this)
    }
}