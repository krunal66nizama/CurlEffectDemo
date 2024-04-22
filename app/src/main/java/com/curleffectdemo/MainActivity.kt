package com.curleffectdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var pageCurlView: PageCurlView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf(R.drawable.img3, R.drawable.img2, R.drawable.img1, R.drawable.img3, R.drawable.img2, R.drawable.img1,R.drawable.img3, R.drawable.img2, R.drawable.img1,R.drawable.img3)

        pageCurlView = findViewById(R.id.pageCurlView)
        pageCurlView.setCurlView(imageList)
        pageCurlView.setCurlSpeed(200)
    }
}