package com.example.attendance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.bu3
import kotlinx.android.synthetic.main.activity_main.bu3 as bu31


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun text(view: View){
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
    fun register(view: View){
        var buselect= view as Button
        when(buselect.id){
            bu3.id->{
                var ch1=tt1.text.toString()
                var ch2=tt2.text.toString()

                if(ch1==""){
                    if(ch2==""){}
                }

            }
        }

    }
}
