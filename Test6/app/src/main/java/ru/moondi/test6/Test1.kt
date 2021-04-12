package ru.moondi.test6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.moondi.test6.databinding.ActivityTest1Binding

class Test1 : AppCompatActivity() {
    lateinit var BindingClass: ActivityTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(BindingClass.root)
       BindingClass.textTest1.text = intent.get("key")
    }

        fun onClickGoMain(view: View){
            intent.putExtra("key2", BindingClass.edTextTest1.text.toString())
            setResult(RESULT_OK, intent)
        }
}