package com.temp.temperaturconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnconvert: Button = findViewById(R.id.btn)



        val etcelsius:EditText=findViewById(R.id.etno)
        val etfahrenheit:TextView=findViewById(R.id.tverror)

        btnconvert.setOnClickListener{

            val celsius= etcelsius.text.toString().toInt()
            val Fahrenheit = celsius*9/5+32
            etfahrenheit.text=Fahrenheit.toString()
        }


        }


    }






