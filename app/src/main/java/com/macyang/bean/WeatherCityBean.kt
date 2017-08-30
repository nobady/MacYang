package com.macyang.bean

/**
 * 天气城市
 * Created by tengfei.lv on 2017/8/30.
 */
data class WeatherCityBean(var code: String, var charge: Boolean, var msg: String,
    var result: Result) {
    data class Result(var msg: String, var status: String, var result: List<Result>) {
        data class Result(var citycode: String, var city: String, var cityid: String,
            var parentid: String)
    }
}