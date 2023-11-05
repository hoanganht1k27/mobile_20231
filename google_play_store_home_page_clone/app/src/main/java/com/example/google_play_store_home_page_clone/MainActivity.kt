package com.example.google_play_store_home_page_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basic_recyclerview_gmail_clone.ItemAdapter
import com.example.google_play_store_home_page_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listOfListIcons : List<ListIcon>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val layoutManager = LinearLayoutManager(this@MainActivity)
        listOfListIcons = listOf(
            ListIcon(
                "Popular",
                listOf(
                    Icon(R.drawable.anh1, "Reddit", "4.1"),
                    Icon(R.drawable.anh1, "Facebook", "4.2"),
                    Icon(R.drawable.anh1, "Instagram", "4.3"),
                    Icon(R.drawable.anh1, "Techcombank", "4.4"),
                    Icon(R.drawable.anh1, "Youtube", "4.5")
                )
            ),
            ListIcon(
                "Popular",
                listOf(
                    Icon(R.drawable.anh1, "Reddit", "4.1"),
                    Icon(R.drawable.anh1, "Facebook", "4.2"),
                    Icon(R.drawable.anh1, "Instagram", "4.3"),
                    Icon(R.drawable.anh1, "Techcombank", "4.4"),
                    Icon(R.drawable.anh1, "Youtube", "4.5")
                )
            ),
            ListIcon(
                "Popular",
                listOf(
                    Icon(R.drawable.anh1, "Reddit", "4.1"),
                    Icon(R.drawable.anh1, "Facebook", "4.2"),
                    Icon(R.drawable.anh1, "Instagram", "4.3"),
                    Icon(R.drawable.anh1, "Techcombank", "4.4"),
                    Icon(R.drawable.anh1, "Youtube", "4.5")
                )
            ),
            ListIcon(
                "Popular",
                listOf(
                    Icon(R.drawable.anh1, "Reddit", "4.1"),
                    Icon(R.drawable.anh1, "Facebook", "4.2"),
                    Icon(R.drawable.anh1, "Instagram", "4.3"),
                    Icon(R.drawable.anh1, "Techcombank", "4.4"),
                    Icon(R.drawable.anh1, "Youtube", "4.5")
                )
            ),
        )
        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.adapter = ItemAdapter(this@MainActivity, listOfListIcons)
    }
}