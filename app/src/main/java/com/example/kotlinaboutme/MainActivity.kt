package com.example.kotlinaboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doneButton:Button=findViewById(R.id.done_btn)
        doneButton.setOnClickListener{
            addNickName(it)
        }
    }

    private fun addNickName(view: View)
    {
        val editText:EditText=findViewById(R.id.nickname_edit)
        val nicknameText:TextView=findViewById(R.id.nickname_text)

        nicknameText.text=editText.text
        editText.visibility=View.GONE
        view.visibility= View.GONE
        nicknameText.visibility=View.VISIBLE

        //hide the keyboard
        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}