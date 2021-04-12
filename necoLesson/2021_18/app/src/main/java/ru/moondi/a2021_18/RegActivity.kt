package ru.moondi.a2021_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.RenderProcessGoneDetail
import ru.moondi.a2021_18.databinding.ActivityRegBinding
var signState = "empty"
class RegActivity : AppCompatActivity() {
    lateinit var BindingClass: ActivityRegBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingClass = ActivityRegBinding.inflate(layoutInflater)
        setContentView(BindingClass.root)
        var string = ""
        signState = intent.getStringExtra(Constants.SIGN_STATE)!!
        if(signState == Constants.SIGN_IN_CONST){
            BindingClass.imAvatarReg.visibility = View.GONE
            BindingClass.bAvatarReg.visibility = View.GONE
            BindingClass.edName.visibility = View.GONE

        }
    }

    fun onClickDone(view: View){
        if(signState == Constants.SIGN_IN_CONST){
            intent.putExtra(Constants.PASSWORD, BindingClass.edPassword2.text.toString())
            intent.putExtra(Constants.LOGIN, BindingClass.edLogin.text.toString())
            setResult(RESULT_OK, intent)
            finish()
            } else if(signState == Constants.SIGN_UP_CONST){

                intent.putExtra(Constants.LOGIN, BindingClass.edLogin.text.toString())
                intent.putExtra(Constants.PASSWORD, BindingClass.edPassword2.text.toString())
                intent.putExtra(Constants.NAME, BindingClass.edName.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }


        }
    }