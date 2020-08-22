package com.prodev.a4layouts

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener { mostrarDatos() }
    }
    val name = nameTV.text.toString()
    val email = emailTV.text.toString()
    val lastName = lastNameTV.text.toString()

    fun mostrarDatos() {


        if (name.isEmpty() || email.isEmpty() || lastName.isEmpty())

            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, "welcome " + name, Toast.LENGTH_LONG).show()


    }
}
