package ru.moondi.a06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import ru.moondi.a06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var BindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)
        var nameList = ArrayList<String>()
        nameList.add("Петя")
        nameList.add("ВАня")
        nameList.add("Маша")
        nameList.add("Ирина")
        nameList.add("Олег")
        nameList.add("Даша")
        nameList.add("Саша")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        BindingClass.listView.adapter = adapter
        BindingClass.listView.setOnItemClickListener { parent, view, position, id ->
            Toast. makeText(this,"нажата кнопка ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
        }

    }
}