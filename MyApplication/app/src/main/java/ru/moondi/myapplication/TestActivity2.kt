package ru.moondi.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

    }
    fun onClickGoTest3(view : View){
    val intent = Intent(this,TestActivity3::class.java)
        startActivity(intent)
    }
    fun onClickGoClose(view : View){
        finish()
    }
}