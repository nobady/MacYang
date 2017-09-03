package com.macyang.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.macyang.R
import com.macyang.bean.ChatMode
import kotlinx.android.synthetic.main.item_send_content.view.*

/**
 * Created by bo on 2017/9/2.
 */
class ChatRecyclerAdapter(val data: List<String>, val context: Context) : RecyclerView.Adapter<ChatRecyclerAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return data?.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var itemView: View? = null
        when (viewType) {
            ChatMode.MODE_SEND -> {
                itemView = LayoutInflater.from(context).inflate(R.layout.item_send_content, parent)
            }
            ChatMode.MODE_ACCEPT -> {
                itemView = LayoutInflater.from(context).inflate(R.layout.item_accept_content, parent)
            }
        }
        return ViewHolder(itemView!!)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.itemView?.findViewById<TextView>(R.id.send_content_tv)?.text = ""
        holder?.itemView?.findViewById<ImageView>(R.id.send_icon_img)?.setImageResource(R.drawable.abc_ab_share_pack_mtrl_alpha)
        holder?.itemView?.findViewById<TextView>(R.id.accept_content_tv)?.text = ""
        holder?.itemView?.findViewById<ImageView>(R.id.accept_icon_img)?.setImageResource(R.drawable.abc_ab_share_pack_mtrl_alpha)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        init {
            itemView.send_content_tv
        }
    }

}