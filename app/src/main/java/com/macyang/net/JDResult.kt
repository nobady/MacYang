package com.macyang.net

/**
 * 京东api返回的公共部分
 * Created by tengfei.lv on 2017/8/29.
 */
data class JDResult<T>(var code: String = "", var charge: Boolean = false, var msg: String = "", var result: T? = null)