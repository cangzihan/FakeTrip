package com.example.faketrip

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<View>(R.id.textView6) as EditText
        val editText1 = findViewById<View>(R.id.textView7) as EditText
        val showText = findViewById<TextView>(R.id.TextTime)

        // Update time when start
        val sdf = SimpleDateFormat("yyyy.M.dd hh:mm:ss")
        val currentDate = sdf.format(Date())
        showText.setText(currentDate)

        // Hide cursor
        editText.isCursorVisible = false
        editText1.isCursorVisible = false
    }
}