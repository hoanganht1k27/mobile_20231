package com.example.basic_recyclerview_gmail_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.basic_recyclerview_gmail_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var userArrayList: ArrayList<User>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageId = intArrayOf(
            R.drawable.anh1,
            R.drawable.anh2,
            R.drawable.anh3,
            R.drawable.anh4,
            R.drawable.anh5,
            R.drawable.anh6,
            R.drawable.keocon,
            R.drawable.sanghiec,
            R.drawable.ayame,
            R.drawable.hutao,
            R.drawable.yoi,
            R.drawable.neko,
            R.drawable.suisei,
            R.drawable.megumin,
            R.drawable.keocon,
            R.drawable.sanghiec
        )
        val name = arrayOf(
            "Nakiri Ayamasf sdf asfe",
            "Hsadf asf sd fas futao",
            "Naasdf asfganohara Yoimiya",
            "sda fas Neko",
            "Hoshiasdf machi Suisei",
            "Mesadfa sf asdfgumin",
            "Wias fdasn Sweet!?",
            "Anhasdf  Sanasdf g Hiasdf ếc",
            "Nakasdf sadiri Ayame",
            "Hutao",
            "Nagads fnohara Yoimiya",
            "Angras fsay Neko",
            "Hoshasd fimachi Suisei",
            "Masdf egumin",
            "Win asdf Sweet!?",
            "Anh Saasdf ng Hiếc"
        )
        val lastMessage = arrayOf(
            "Vẫn những câu hỏi nhỏ",
            "Sau baoasd f asf tháng chia ly",
            "Anh vẫn thasd fdasf asường thắc mắc",
            "Khi anh kh asdf asdf asông làm gì",
            "Em dạo nàydf dasf asd có còn xem phim một mình?",
            "Em dạo n asdfsd ày có đồ ăn và shopping?",
            "Ngày xuâas fds fdsn em có xuống phố không người",
            "Và tán asd fdasf adương cỏ cây lặng thinh?",
            "Vẫn nhữasd fasdfng câu hỏi nhỏ",
            "Sau asd fdasd fasasbao tháas fsda fng chia ly",
            "Anh asdf asdfva sfdsẫn thườn asdf g thắc mắc",
            "Khi anh kas dfsdahông làm gì",
            "Em asdf as dfdạo nàyasd fasd có còn xem phim một mình?",
            "Em das fsdạo này có đồ ăn và shopping?",
            "Ngày xus dfasd asdf asân em có xsd afsdauốn asdfg phố không người",
            "Và tán dư asdfơng cỏ cây lặ sadfng thi asdf nh?"
        )
        val lastMsgtime = arrayOf(
            "11:00 PM",
            "3:00 PM",
            "2:35 PM",
            "1:17 PM",
            "11:30 AM",
            "11:15 AM",
            "10: 00 AM",
            "6:45 AM",
            "11:00 PM",
            "3:00 PM",
            "2:35 PM",
            "1:17 PM",
            "11:30 AM",
            "11:15 AM",
            "10: 00 AM",
            "6:45 AM"
        )
        val phoneNo = arrayOf(
            "1222", "1222", "1222", "1222", "1222", "1222","112233","11111","1222", "1222", "1222", "1222", "1222", "1222","112233","11111"
        )
        val country = arrayOf(
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
            "Japanese",
        )
        userArrayList = ArrayList()
        for (i in name.indices) {
            val user =
                User(name[i], lastMessage[i], lastMsgtime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }

        val layoutManager = LinearLayoutManager(this@MainActivity)
        binding.recyclerview.layoutManager = layoutManager

        binding.recyclerview.adapter = ItemAdapter(this@MainActivity, userArrayList)
    }
}