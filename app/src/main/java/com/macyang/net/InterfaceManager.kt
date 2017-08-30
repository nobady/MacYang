package com.macyang.net

import com.android.volley.Request
import com.macyang.constants.Constants
import com.macyang.utils.HttpUtils
import com.macyang.utils.RequestListener

/**
 * 所有的网络请求管理器
 * Created by tengfei.lv on 2017/8/29.
 */
object InterfaceManager {
    /**
     * 获取新闻信息
     * T = $NewsBean
     */
    inline fun <reified T> getNewsInfo(channel: String, startIndex: Int,
        listener: RequestListener<T>
        ): Request<ByteArray> {
        val map = HashMap<String, String>()
        map.put("channel", channel)
        map.put("start", startIndex.toString())
        map.put("num", "20")
        map.put("appkey", Constants.APP_KEY)
        return HttpUtils.getRequest(Constants.NEWS_URL, map, listener, 0)
    }

    /**
     * 获取天气信息
     * T = WeatherInfoBean
     */
     inline fun <reified T> getWeatherInfo(cityId:String,listener: RequestListener<T>): Request<ByteArray> {
        val map = HashMap<String, String>()
        map.put("cityId", cityId)
        map.put("appkey", Constants.APP_KEY)
        return HttpUtils.getRequest(Constants.WEATHER_URL, map, listener, 1)
    }

    /**
     * 获取城市信息
     * T = WeatherCityBean
     */
     inline fun <reified T> getWeatherCity(listener: RequestListener<T>): Request<ByteArray> {
        val map = HashMap<String, String>()
        map.put("appkey", Constants.APP_KEY)
        return HttpUtils.getRequest(Constants.WEATHER_CITY_URL, map, listener, 2)
    }

    /**
     * 获取菜谱分类
     * T = RecipeTypeBean
     */
    inline fun <reified T> getRecipeType(listener: RequestListener<T>): Request<ByteArray> {
        val map = HashMap<String, String>()
        map.put("appkey", Constants.APP_KEY)
        return HttpUtils.getRequest(Constants.RECIPE_CLASS_URL, map, listener, 3)
    }

    /**
     * 根据菜谱分类搜索
     * T = SearchRecipeByTypeBean
     */
    inline fun <reified T> searchRecipeByClass(classId:String,start:Int,listener: RequestListener<T>): Request<ByteArray> {
        val map = HashMap<String, String>()
        map.put("appkey", Constants.APP_KEY)
        map.put("start", start.toString())
        map.put("classid", classId)
        map.put("num", "10")
        return HttpUtils.getRequest(Constants.SEARCH_RECIPE_BY_CLASS, map, listener, 4)
    }

    /**
     * 根据菜谱id获取菜谱详情
     * T = RecipeDetailBean
     */
    inline fun <reified T> getRecipeDetail(id:String,listener: RequestListener<T>): Request<ByteArray> {
        val map = HashMap<String, String>()
        map.put("appkey", Constants.APP_KEY)
        map.put("id", id)
        return HttpUtils.getRequest(Constants.RECIPE_DETAIL_BYID, map, listener, 5)
    }
}