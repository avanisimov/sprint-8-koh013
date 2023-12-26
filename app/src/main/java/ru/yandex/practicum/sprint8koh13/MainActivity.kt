package ru.yandex.practicum.sprint8koh13

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private var lastOnStop: Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<MaterialButton>(R.id.btn_2)

        this.resources
        Log.d("SPRINT_8", "$this onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "$this onStart")
//        startUpdate()

        if (System.currentTimeMillis() - lastOnStop > 15000) {

        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "$this onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "$this onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "$this onStop")
//        stopUpdate()
        lastOnStop = System.currentTimeMillis()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "$this onDestroy")
    }
}