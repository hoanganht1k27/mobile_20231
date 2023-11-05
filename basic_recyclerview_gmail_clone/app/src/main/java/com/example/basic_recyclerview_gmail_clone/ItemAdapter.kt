package com.example.basic_recyclerview_gmail_clone

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val context: Activity, private val items: List<User>) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.imageView.setImageResource(items[position].imageId)
        holder.username.text = items[position].name
        holder.lastMsg.text = items[position].lastMessage
        holder.lastMsgtime.text = items[position].lastMsgtime
    }

    override fun getItemCount(): Int {
        return items.size
    }
}