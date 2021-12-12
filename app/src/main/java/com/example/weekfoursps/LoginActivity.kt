package com.example.weekfoursps

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var usrnme=findViewById<EditText>(R.id.usernameedit)


        var passwrd=findViewById<EditText>(R.id.Passwordedit)


        var logbtn=findViewById<Button>(R.id.loginButton)

        var logstatus:String="false"

        logbtn.setOnClickListener{

            logstatus="true"
            var sp:SharedPreferences=getSharedPreferences("usertable", Context.MODE_PRIVATE)

            val ed:SharedPreferences.Editor=sp.edit()

            ed.putString("username",usrnme.text.toString())

            ed.putString("password",passwrd.text.toString())

            ed.putString("loginstatus",logstatus)


            ed.commit()

            var ckun=usrnme.text.toString()
            var ckpass=passwrd.text.toString()


            if (ckun!="" ||  ckpass!="")
            {


                var i=Intent(applicationContext,HomePage::class.java)
                startActivity(i)
                this.finish()
            }
            else{

                Toast.makeText(this,"Enter Data Correctly...!!",Toast.LENGTH_LONG).show()
            }



        }


//        moveTaskToBack(true)
//        finishAffinity()


    }
}