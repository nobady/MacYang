package com.macyang.bean

/**
 * Created by tengfei.lv on 2017/8/29.
 */
data class NewsBean(var msg: String, var result: Result, var status: String) {
    data class Result(var num: String, var channel: String, var list: List<ListBean>) {
        data class ListBean(var src: String, var weburl: String, var time: String, var pic: String,
            var title: String, var category: String, var content: String, var url: String)
    }
}