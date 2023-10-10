package com.mariomorenoarroyo.intentsej4

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val setAlarm = findViewById<Button>(R.id.alarm)
        extracted(setAlarm)
        
        val botonWeb = findViewById<Button>(R.id.button2)
        extracted2(botonWeb)

        val botonContacts = findViewById<Button>(R.id.button3)
        extracted3(botonContacts)
    }

    private fun extracted(setAlarm: Button) {
        setAlarm.setOnClickListener {
            val Alarm = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, "Alarma")
                putExtra(AlarmClock.EXTRA_HOUR, 12)
                putExtra(AlarmClock.EXTRA_MINUTES, 30)
            }
            startActivity(Alarm)
        }
    }


    private fun extracted2(botonWeb: Button) {
        botonWeb.setOnClickListener {
            val Web = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, "https://www.w3schools.com/")
            }

            startActivity(Web)

        }
    }

    private fun extracted3(botonContacts: Button) {
        botonContacts.setOnClickListener {
            val Contacts = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("content://contacts/people/")

            }

            startActivity(Contacts)
        }
    }


}