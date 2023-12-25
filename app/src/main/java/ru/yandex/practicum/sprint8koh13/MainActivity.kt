package ru.yandex.practicum.sprint8koh13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<MaterialButton>(R.id.btn_2)

        Log.d("SPRINT_*", "btn1 $btn1")
        Log.d("SPRINT_*", "btn2 $btn2")
    }
}