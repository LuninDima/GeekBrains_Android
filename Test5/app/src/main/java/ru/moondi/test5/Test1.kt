package ru.moondi.test5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.moondi.test5.databinding.ActivityTest1Binding

class Test1 : AppCompatActivity() {
    lateinit var BindingClass: ActivityTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(BindingClass.root)
        val message = intent.getStringExtra("key")
        BindingClass.textViewTest1.text = message

    }
      fun  onClickClose(view: View){
          intent.putExtra("key2", BindingClass.edTextTest1.text.toString())
          setResult(RESULT_OK, intent)
          finish()
      }

}