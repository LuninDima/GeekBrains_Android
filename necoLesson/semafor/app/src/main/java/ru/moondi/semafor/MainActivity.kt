package ru.moondi.semafor

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import ru.moondi.semafor.databinding.ActivityMainBinding

class MainActivity : Activity() {
    var imSemafor:ImageView? = null
    lateinit var BindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)
        textView2.

    }

    fun onClickStartStop(view: View){
        BindingClass.imSemafor?.setImageResource(R.drawable.green)
        view as ImageButton
        view.setImageResource(R.drawable.buttonstop)
    }
}