package ru.moondi.lesson2

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.TextView
import ru.moondi.lesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var BindingClass: ActivityMainBinding
    var text1:String = "Я <пошел> гулять с подругой на <улицу>"
    var textView:TextView? = null
    var textView2:TextView? = null
    var textTemp1:String =""
    var textTemp2:String =""
    var arrayNumber:Array<Int> = arrayOf(2,3,4,5,6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)
        textView = BindingClass.textView
        textView2 = BindingClass.textView2
        textTemp1 = text1.substringAfter("<")
        textView?.setText(arrayNumber[1]).toString()
        textTemp2 = text1.substringAfterLast("<")
        textView2?.setText(textTemp2.substringBeforeLast(">"))
    //    textTemp2 = textTemp1.substringAfter("<")
    //    textView2?.setText(textTemp2.substringBefore(">")).toString()


    }

}