package com.example.helloworldmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var plus = findViewById<Button>(R.id.increment_button)
        var text = findViewById<TextView>(R.id.textview)

        var count: Int = 0;

        plus.setOnClickListener(){
            count++

            text.setText(count.toString())

        }
    }
}

