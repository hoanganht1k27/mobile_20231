package com.example.basic_recyclerview_gmail_clone

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView =itemView.findViewById(R.id.profile_pic)
    val username : TextView = itemView.findViewById(R.id.personName)
    val lastMsg : TextView = itemView.findViewById(R.id.lastMessage)
    val lastMsgtime: TextView =itemView.findViewById(R.id.msgTime)

    init {
        itemView.setOnClickListener() {
            Log.d("click", "hello")
        }
    }
}