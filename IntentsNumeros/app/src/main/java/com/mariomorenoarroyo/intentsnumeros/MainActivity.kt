package com.mariomorenoarroyo.intentsnumeros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count1 = 0
        var count2 = 0
        var count3 = 0
        var count4 = 0

        val num1 = findViewById<Button>(R.id.num1)
        val num2 = findViewById<Button>(R.id.num2)
        val num3 = findViewById<Button>(R.id.num3)
        val num4 = findViewById<Button>(R.id.num4)

        val text1 = findViewById<TextView>(R.id.num1text)
        val text2 = findViewById<TextView>(R.id.num2text)
        val text3 = findViewById<TextView>(R.id.num3text)
        val text4 = findViewById<TextView>(R.id.num4text)


        num1.setOnClickListener {
            count1++
            text1.text = "$count1"
            launchSecundaryActivity(count1)

        }

        num2.setOnClickListener {
            count2++
            text2.text = "$count2"
            launchSecundaryActivity(count2)
        }

        num3.setOnClickListener {
            count3++
            text3.text = "$count3"
            launchSecundaryActivity(count3)
        }

        num4.setOnClickListener {
            count4++
            text4.text = "$count4"
            launchSecundaryActivity(count4)
        }


    }

    private fun launchSecundaryActivity(count: Int) {
        val intent = Intent(this, SecundaryActivity::class.java)
        intent.putExtra("count", count)
        startActivity(intent)

    }
}
