package com.macyang.bean

/**
 * 根据菜谱分类查找  bean
 * Created by tengfei.lv on 2017/8/30.
 */
data class SearchRecipeByTypeBean(var code: String, var charge: Boolean, var msg: String,
    var result: Result) {
    data class Result(var msg: String, var result: Result, var status: String) {
        data class Result(var num: String, var list: List<ListBean>) {
            data class ListBean(var classid: String, var preparetime: String, var name: String,
                var id: String, var pic: String, var tag: String, var peoplenum: String,
                var content: String, var cookingtime: String, var process: List<Process>,
                var material: List<Material>) {
                data class Process(var pcontent: String, var pic: String)

                data class Material(var amount: String, var mname: String, var `type`: String)
            }
        }
    }
}