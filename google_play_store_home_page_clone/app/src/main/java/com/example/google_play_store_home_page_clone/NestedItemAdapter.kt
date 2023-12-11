package com.example.google_play_store_home_page_clone

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NestedItemAdapter(private val context: Activity, private val items: List<Icon>) : RecyclerView.Adapter<NestedItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return NestedItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: NestedItemViewHolder, position: Int) {
        holder.image.setImageResource(items[position].image)
        holder.appName.text = items[position].appName
        holder.ratingNumber.text = items[position].ratingNumber
    }

    override fun getItemCount(): Int {
        return items.size
    }
}