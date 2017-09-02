package com.macyang.chat

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.VolleyError
import com.macyang.R
import com.macyang.base.BaseNetFragment
import com.macyang.bean.ChatBean
import kotlinx.android.synthetic.main.fragment_chat.*

/**
 * Created by bo on 2017/9/1.
 */
class ChatFragment : BaseNetFragment<ChatView, ChatPresenter, ChatBean>(), ChatView {
    val TAG: String = "ChatFragment"

    override fun getLayout(): Int {
        return R.layout.fragment_chat
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun success(tag: Int, bean: ChatBean) {
        Log.e(TAG, "Content = $bean")
    }

    override fun failed(tag: Int, error: VolleyError) {
        Log.e(TAG, "Error = ${error.message}")
    }

    override fun createPresenter(): ChatPresenter {
        return ChatPresenter()
    }

    override fun requestData() {
        presenter?.sendChatContent("你好！", this)
    }
}