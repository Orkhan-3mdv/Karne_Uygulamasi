package com.example.karneuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button1.setOnClickListener(){

                val ders1 = editText.text.toString()
                val ders2 = editText2.text.toString()
                val ders3 = editText3.text.toString()
                val ders4 = editText4.text.toString()
                val ders5 = editText5.text.toString()

                val nextToSonuc = Intent(this,Sonuc::class.java)



                nextToSonuc.putExtra("data",ders1)
                nextToSonuc.putExtra("data2",ders2)
                nextToSonuc.putExtra("data3",ders3)
                nextToSonuc.putExtra("data4",ders4)
                nextToSonuc.putExtra("data5",ders5)

                startActivity(nextToSonuc)

            }


        }

    }

