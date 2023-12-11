package com.example.tutorial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter (var context : Context, var mangmonan : ArrayList<MonAn>) : BaseAdapter(){

    class ViewHolder(row: View) {
        var textviewtenmonan : TextView
        var imageviewmonan : ImageView

        init {
            textviewtenmonan = row.findViewById(R.id.textviewmonan)
            imageviewmonan = row.findViewById(R.id.imageviewhinhmonan)
        }
    }

    override fun getCount(): Int {
        return mangmonan.size
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if (convertView == null) {
            var layoutInFlatter : LayoutInflater = LayoutInflater.from(context)
            view = layoutInFlatter.inflate(R.layout.dong_monan, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var monAn : MonAn = getItem(position) as MonAn
        viewHolder.textviewtenmonan.text = monAn.ten
        viewHolder.imageviewmonan.setImageResource(monAn.hinhanh)

        return view as View
    }
}