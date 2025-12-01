package com.bignerbranch.android.zykovasa_01_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val imageView = findViewById<ImageView>(R.id.imageView2)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val input = s.toString().trim().lowercase()

                when {
                    input == "круг" -> {
                        imageView.setImageResource(R.drawable.figure2)
                    }
                    input == "треугольник" -> {
                        imageView.setImageResource(R.drawable.figure3)
                    }
                    else -> {
                        imageView.setImageResource(R.drawable.figure1)
                    }
                }
            }
        })
    }

    fun Rachet_Button(view: View) {
        fun afterTextChanged(s: Editable?) {
            val imageView = findViewById<ImageView>(R.id.imageView2)
            val input = s.toString().trim().lowercase()
            when {
                input == "круг" -> {
                    imageView.setImageResource(R.drawable.figure2)
                }
            }
        }
    }


}