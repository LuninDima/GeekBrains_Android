package ru.moondi.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test4)
    }

    fun onClickGoMain2(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}