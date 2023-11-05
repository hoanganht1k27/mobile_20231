package com.example.basic_recyclerview_gmail_clone

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.google_play_store_home_page_clone.R

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var listIconTitle : TextView = itemView.findViewById(R.id.list_icon_title)
    var nestedRecyclerView : RecyclerView = itemView.findViewById(R.id.nested_recyclerview)
}