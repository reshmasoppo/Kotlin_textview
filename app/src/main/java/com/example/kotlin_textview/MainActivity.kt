package com.example.kotlin_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

       //variable that we shall initialize at a later point in code
          // lateinit var button1:Button
              lateinit var textname1:TextView
              lateinit var ediitText1:EditText
              lateinit  var inputValue:String

           override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main)

                textname1 = findViewById<TextView>(R.id.textView)
                ediitText1=findViewById<EditText>(R.id.editText)


              //second way of initilization
               //  val editText:EditText = findViewById<EditText>(R.id.editText)
              button.setOnClickListener {

                     inputValue=editText.text.toString()
                     textname1.setText(inputValue)

          Toast.makeText(this,"Values are" +inputValue,Toast.LENGTH_SHORT).show()
}
}
}


