package com.shekhar.profileapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val button = findViewById<Button>(R.id.clickhere)
        val text = findViewById<TextView>(R.id.textView3)
        var isClicked =false
        button.setOnClickListener {
            if(!isClicked){
                text.setText("changed on click")
                isClicked = true
            }else{
                text.setText("Shekhar Aggarwal")
                isClicked = false
            }
//            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
    }

}