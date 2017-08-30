package com.macyang.bean

/**
 * 菜谱详情bean
 * Created by tengfei.lv on 2017/8/30.
 */
data class RecipeDetailBean(var code: String, var charge: Boolean, var msg: String,
    var result: Result) {
    data class Result(var msg: String, var result: Result, var status: String) {
        data class Result(var classid: String, var preparetime: String, var name: String,
            var id: String, var pic: String, var tag: String, var peoplenum: String,
            var content: String, var cookingtime: String, var process: List<Process>,
            var material: List<Material>) {
            data class Process(var pcontent: String, var pic: String)

            data class Material(var amount: String, var mname: String, var `type`: String)
        }
    }
}