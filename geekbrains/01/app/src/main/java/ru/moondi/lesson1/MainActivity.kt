package ru.moondi.lesson1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var arg1: Int? = null
    private var arg2: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            try {
                arg1 = Integer.valueOf(editText1.text.toString())
                arg2 = Integer.valueOf(editText2.text.toString())
                if (arg1 === arg2) {
                    textView.text = "Равно!"
                } else {
                    textView.text = "не Равно!"
                }
            } catch (e: Exception) {
                textView.setText("Введите число!");
            }
        }
    }
}
