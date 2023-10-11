package com.mariomorenoarroyo.intentsnumeros

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecundaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secundary_activity)

        val intent = intent
        val count = intent.getIntExtra("count", 0)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = " $count"

        val volver = findViewById<Button>(R.id.volver)
        volver.setOnClickListener {
            finish()
        }

    }
}

