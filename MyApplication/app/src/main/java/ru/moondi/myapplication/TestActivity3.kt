package ru.moondi.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)
    }
    fun onclickGoMain(view: View){
        val intent = Intent(this, TestActivity4::class.java)
        startActivity(intent)
    }

    fun onClickGoClose(view : View){
        finish()
    }

}