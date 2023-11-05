package com.example.google_play_store_home_page_clone

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NestedItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image : ImageView = itemView.findViewById(R.id.imageview)
    var appName : TextView = itemView.findViewById(R.id.appname)
    var ratingNumber : TextView = itemView.findViewById(R.id.ratingnumber)
}