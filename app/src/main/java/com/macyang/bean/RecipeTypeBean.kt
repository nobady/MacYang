package com.macyang.bean

/**
 * 菜谱分类bean
 * Created by tengfei.lv on 2017/8/30.
 */
data class RecipeTypeBean(var code: String, var charge: Boolean, var msg: String,
    var result: Result) {
    data class Result(var msg: String, var status: String, var result: List<Result>) {
        data class Result(var classid: String, var name: String, var parentid: String,
            var list: List<ListBean>) {
            data class ListBean(var classid: String, var name: String, var parentid: String)
        }
    }
}