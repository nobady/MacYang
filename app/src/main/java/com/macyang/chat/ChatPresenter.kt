package com.macyang.chat

import com.macyang.base.BasePresenter
import com.macyang.bean.ChatBean
import com.macyang.net.InterfaceManager
import com.macyang.utils.RequestListener

/**
 * Created by bo on 2017/9/1.
 */
class ChatPresenter : BasePresenter<ChatView>() {

    fun sendChatContent(content: String, listener: RequestListener<ChatBean>) {
        val sendChatMsg = InterfaceManager.sendChatMsg(content, listener)
        requestList.add(sendChatMsg)
    }
}