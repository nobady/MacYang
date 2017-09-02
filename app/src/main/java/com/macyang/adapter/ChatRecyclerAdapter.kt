package com.macyang.adapter

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by bo on 2017/9/2.
 */
class ChatRecyclerAdapter(val mData: List<String>) : RecyclerView.Adapter<ChatRecyclerAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    }

    override fun getItemCount(): Int {
        return if (mData == null) 0 else mData.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        when(viewType){

        }
        //:TODO
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView)
}