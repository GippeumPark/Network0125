package com.example.network0125

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btnTextDownload 불러와지지 않을때, module수준의 build.gradle plugins에 id 'kotlin-android-extensions' 작성하거나
        //뷰를 직접 찾아서 변수로 생성
/*        val btnTextDownload = findViewById<Button>(R.id.btnTextDownload) */
        btnKakaoAPI.setOnClickListener{
            val intent = Intent(this, KakaoOpenAPIActivity::class.java)
            startActivity(intent)
        }
        btnItemDetail.setOnClickListener{
            val intent = Intent(this, ItemDetailActivity::class.java)
            startActivity(intent)
        }
        btnItemInsert.setOnClickListener{
            val intent = Intent(this, ItemInsertActivity::class.java)
            startActivity(intent)
        }
    }
}