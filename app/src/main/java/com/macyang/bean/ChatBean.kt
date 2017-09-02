package com.macyang.bean

/**
 * Created by bo on 2017/9/1.
 */

data class ChatBean(
		var code: String,// 10000
		var charge: Boolean,// false
		var msg: String,// 查询成功
		var result: Result
)

data class Result(
		var code: Int,// 100000
		var text: String// 你也好，腰好肾好耐力好。😂
)