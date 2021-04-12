package ru.moondi.test5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.moondi.test5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var BindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)

    }

    fun onClickGoTest1(view:View){
        val intent = Intent(this, Test1::class.java)
        intent.putExtra("key", "Как тебя зовут?")
        startActivityForResult(intent, 100)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == RESULT_OK && data != null){
            val message = data.getStringExtra("key2")
            BindingClass.textView.text = message
        }
    }

}