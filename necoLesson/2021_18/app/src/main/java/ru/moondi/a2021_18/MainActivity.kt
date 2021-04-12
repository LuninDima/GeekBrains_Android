package ru.moondi.a2021_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.moondi.a2021_18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0
    lateinit var BindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)

    }


   fun  onClickAuth(view: View){
        var intent = Intent(this, RegActivity::class.java)
       intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_IN_CONST)
       startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_IN)
    }






    fun onClickSignUp(view:View){
        var intent = Intent(this, RegActivity::class.java)
        intent.putExtra(Constants.SIGN_STATE, Constants.SIGN_UP_CONST)
        startActivityForResult(intent, Constants.REQUEST_CODE_SIGN_UP)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constants.REQUEST_CODE_SIGN_IN && data != null){
            var l = data.getStringExtra(Constants.LOGIN)
            var p = data.getStringExtra(Constants.PASSWORD)
            if(login == l && password == p){
                BindingClass.tvInfo.text = "Вы успешно авторизированы"
            } else {
                BindingClass.tvInfo.text = "введенные данные не верны"
            }

        } else if (requestCode == Constants.REQUEST_CODE_SIGN_UP && data != null){
            login = data.getStringExtra(Constants.LOGIN)!!
            password = data.getStringExtra(Constants.PASSWORD)!!
            name = data.getStringExtra(Constants.NAME)!!
            BindingClass.tvInfo.text = "вы успешно зарегистрированы"
        }
    }
}