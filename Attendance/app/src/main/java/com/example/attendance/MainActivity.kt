package com.example.attendance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bu3


import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    private var ch=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun registe(view:View){
        var buselect= view as Button
        when(buselect.id){
            bu2.id->{
                var intent=Intent(applicationContext,MainActivity2::class.java)
                startActivity(intent)
            }
            bu3.id->{
                var intent=Intent(applicationContext,MainActivity3::class.java)
                startActivity(intent)
            }

        }
    }
    fun text(view:View){
        var buselect= view as TextView
        when(buselect.id){
            tt1.id->
            {//text view of email is selected
                tt1.setText("")
            }
            tt2.id->
            {//text view of email is selected
                tt2.setText("")
            }
        }

    }
    fun register(view:View){
        var buselect= view as Button
        when(buselect.id){
            bu3.id->{
                var ch1=tt1.text.toString()
                var ch2=tt2.text.toString()

            }
        }

    }

}
