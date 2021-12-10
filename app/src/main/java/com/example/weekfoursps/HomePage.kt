package com.example.weekfoursps

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var sp: SharedPreferences =getSharedPreferences("usertable", Context.MODE_PRIVATE)


        var usernameshowvar=findViewById(R.id.usernameshow) as TextView

        var passwordshowvar=findViewById(R.id.passwordshow) as TextView

        usernameshowvar.setText(sp.getString("username","Error...!!"))
        passwordshowvar.setText(sp.getString("password","Error...!!"))


        var logoutbtn=findViewById(R.id.logout) as Button

        var closebtn=findViewById(R.id.closeappbutton) as Button


        logoutbtn.setOnClickListener{
            var cngval="false"

            var sps: SharedPreferences =getSharedPreferences("usertable", Context.MODE_PRIVATE)

            val ed:SharedPreferences.Editor=sp.edit()


            ed.putString("loginstatus",cngval)

            ed.commit()

            var i=Intent(applicationContext,LoginActivity::class.java)
            startActivity(i)

            this.finish()


        }

        closebtn.setOnClickListener{

            //exitProcess(-1)
            finishAffinity()
        }
    }
}