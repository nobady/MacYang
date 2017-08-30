package com.macyang.bean

/**
 * 天气详情bean
 * Created by tengfei.lv on 2017/8/30.
 */
data class WeatherInfoBean(var code: String, var charge: Boolean, var msg: String,
    var result: Result) {
    data class Result(var msg: String, var result: Result, var status: String) {
        data class Result(var date: String, var templow: String, var temp: String, var img: String,
            var week: String, var city: String, var windpower: String, var cityid: String,
            var pressure: String, var temphigh: String, var citycode: String,
            var winddirect: String, var weather: String, var aqi: Aqi, var humidity: String,
            var windspeed: String, var updatetime: String, var index: List<Index>,
            var daily: List<Daily>, var hourly: List<Hourly>) {
            data class Aqi(var co24: String, var ipm2_5: String, var io3: String,
                var primarypollutant: String, var no2: String, var no224: String, var ico: String,
                var o38: String, var o324: String, var so2: String, var pm2_5: String,
                var so224: String, var o3: String, var pm10: String, var pm1024: String,
                var pm2_524: String, var co: String, var aqiinfo: Aqiinfo, var quality: String,
                var aqi: String, var ino2: String, var ipm10: String, var io38: String,
                var iso2: String, var timepoint: String) {
                data class Aqiinfo(var measure: String, var color: String, var level: String,
                    var affect: String)
            }

            data class Index(var ivalue: String, var detail: String, var iname: String)

            data class Daily(var date: String, var sunrise: String, var week: String,
                var sunset: String, var night: Night, var day: Day) {
                data class Night(var templow: String, var img: String, var winddirect: String,
                    var windpower: String, var weather: String)

                data class Day(var img: String, var winddirect: String, var windpower: String,
                    var weather: String, var temphigh: String)
            }

            data class Hourly(var temp: String, var img: String, var weather: String,
                var time: String)
        }
    }
}