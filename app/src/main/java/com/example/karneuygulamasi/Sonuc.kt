package com.example.karneuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sonuc.*


class Sonuc : AppCompatActivity() {

        private lateinit var puan1 :EditText
        private lateinit var puan2 :EditText
        private lateinit var puan3 :EditText
        private lateinit var puan4 :EditText
        private lateinit var puan5 :EditText
        private lateinit var sonucs :TextView
        private lateinit var btn :Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)


        val ders1 = intent.getStringExtra("data")
        val ders2 = intent.getStringExtra("data2")
        val ders3 = intent.getStringExtra("data3")
        val ders4 = intent.getStringExtra("data4")
        val ders5 = intent.getStringExtra("data5")

        puan1 = findViewById(R.id.editText11)
        puan2 = findViewById(R.id.editText15)
        puan3 = findViewById(R.id.editText13)
        puan4 = findViewById(R.id.editText14)
        puan5 = findViewById(R.id.editText12)

        sonucs = findViewById(R.id.textView21)
        btn = findViewById(R.id.button)

        textView10.text = ders1
        textView11.text = ders2
        textView12.text = ders3
        textView13.text = ders4
        textView14.text = ders5

            btn.setOnClickListener(){
                calculate()
            }


    }


    fun calculate(){
        val derssayi:Int = 5
        val value1 = puan1.text.toString().toInt()
        val value2 = puan1.text.toString().toInt()
        val value3 = puan1.text.toString().toInt()
        val value4 = puan1.text.toString().toInt()
        val value5 = puan1.text.toString().toInt()
        val result = (((value1+value2+value3+value4+value5)/derssayi))

        if(result>100)
        {
            val result2 = result / 10
            sonucs.setText((result2.toString()))
        }

        else sonucs.setText(result.toString())
    }

    }
