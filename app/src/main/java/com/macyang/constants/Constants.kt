package com.macyang.constants

/**
 * 常量类
 * Created by tengfei.lv on 2017/8/28.
 */
class Constants {

    companion object {
        /**
         * 京东api所需的appkey
         */
        const val APP_KEY = "cb0dd6e182f68fc3cda15fe64f505c16"

        /**
         * 新闻url
         * 用法参见：https://wx.jcloud.com/market/datas/31/11073
         */
        const val NEWS_URL = "https://way.jd.com/jisuapi/get"

        /**
         * 天气url
         * 用法参见：https://wx.jcloud.com/market/datas/26/11065
         */
        const val WEATHER_URL = "https://way.jd.com/jisuapi/weather"

        /*城市url*/
        const val WEATHER_CITY_URL = "https://way.jd.com/jisuapi/weather1"

        /**
         * 菜谱分类
         * 用法参见：https://wx.jcloud.com/market/datas/18/11072
         */
        const val RECIPE_CLASS_URL = "https://way.jd.com/jisuapi/recipe_class"

        /*按照菜谱分类查找*/
        const val SEARCH_RECIPE_BY_CLASS = "https://way.jd.com/jisuapi/byclass"

        /*根据id找到菜谱的详情*/
        const val RECIPE_DETAIL_BYID = "https://way.jd.com/jisuapi/detail"

        /**
         * 图灵聊天机器人
         * 用法参见：https://wx.jcloud.com/market/datas/18/10659
         */
        const val CHAT_ROBOT_URL = "https://way.jd.com/turing/turing"

    }
}