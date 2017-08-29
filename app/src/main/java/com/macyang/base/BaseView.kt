package com.macyang.base

/**
 * Created by tengfei.lv on 2017/8/28.
 */
interface BaseView {

    fun showLoadDialog()

    fun hideLoadDialog()

    fun showErrorDialog(msg:String)

    fun showEmptyDialog(msg: String)
}