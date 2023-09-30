package com.mariomorenoarroyo.ejercicio1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    public lateinit var boton : Button
    public lateinit var texto1 : EditText
    public lateinit var texto2 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton =findViewById<Button>(R.id.boton1)
        texto1=findViewById<EditText>(R.id.usuario)
        texto2=findViewById<EditText>(R.id.Password)

        boton.setOnClickListener {
            val usuario = texto1.text.toString()
            val contrasena = texto2.text.toString()
            val mensajeToast="Tu email es $usuario \n y su contraseña es $contrasena"

            Toast.makeText(this,mensajeToast, Toast.LENGTH_LONG).show()


        }
    }
}