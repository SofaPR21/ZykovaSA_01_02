package com.bignerbranch.android.zykovasa_01_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)
    }

    fun start_Button(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}