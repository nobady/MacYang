package com.macyang.bean

/**
 * Created by tengfei.lv on 2017/8/29.
 */
data class NewsBean(var code: String, var charge: Boolean, var msg: String, var result:ResultBean)
data class ResultBean(var msg: String, var result: ResultBean1, var status: String)
data class ResultBean1(var num: String, var channel: String, var list: List<ListBean>)
data class ListBean(var src: String, var weburl: String, var time: String, var pic: String,
            var title: String, var category: String, var content: String, var url: String)

