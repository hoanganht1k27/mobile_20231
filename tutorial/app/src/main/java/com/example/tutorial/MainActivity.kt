package com.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arraymonan : ArrayList<MonAn> = ArrayList()
        arraymonan.add(MonAn("Banh my op la", R.drawable.myself3))
        arraymonan.add(MonAn("Xuc xich ran", R.drawable.myself))
//        var mangMonHoc : List<String> = listOf("IOS", "Android", "PHP")
        var listView = findViewById<ListView>(R.id.listview)
        listView.adapter = CustomAdapter(this@MainActivity, arraymonan)
//        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mangMonHoc)
    }
}