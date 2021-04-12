package ru.moondi.test6

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import ru.moondi.test6.databinding.ActivityMainBinding
import ru.moondi.test6.databinding.ActivityTest1Binding
import java.util.*

class MainActivity : AppCompatActivity() {
lateinit var BindingClass: ActivityMainBinding
var start:Boolean = false
    var tvText:TextView? = null
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)
        tvText = BindingClass.textView
        tvText?.setText(counter.toString())
        Thread{
            start = true

            var view: TextView = BindingClass.textView
            while (start){
                Thread.sleep(1000)
                runOnUiThread {
                    if(counter == 5) {
                        BindingClass.textView.setBackgroundColor(Color.BLACK)

                    }
                    tvText?.setText(counter.toString())
                    counter++
                }
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        start = false
    }

    fun onClickGoToTest1(view: View){
        val intent = Intent(this, Test1::class.java)
        intent.putExtra("key", BindingClass.edText1.text.toString())
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