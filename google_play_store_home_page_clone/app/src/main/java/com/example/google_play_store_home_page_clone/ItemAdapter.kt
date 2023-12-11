package com.example.basic_recyclerview_gmail_clone

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.google_play_store_home_page_clone.Icon
import com.example.google_play_store_home_page_clone.ListIcon
import com.example.google_play_store_home_page_clone.NestedItemAdapter
import com.example.google_play_store_home_page_clone.R

class ItemAdapter(private val context: Activity, private val items: List<ListIcon>) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.nestedRecyclerView.layoutManager = layoutManager
        holder.nestedRecyclerView.adapter = NestedItemAdapter(context, items[position].icons)
        holder.listIconTitle.text = items[position].listIconTitle
    }

    override fun getItemCount(): Int {
        return items.size
    }
}