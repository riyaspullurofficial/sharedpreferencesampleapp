package com.example.weekfoursps

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val i=Intent(applicationContext,MainActivity::class.java)
    startActivity(i)



        var sp: SharedPreferences =getSharedPreferences("usertable", Context.MODE_PRIVATE)
        var es=sp.getString("loginstatus","Err")

        if (es=="true" )
        {
            var i=Intent(applicationContext,HomePage::class.java)
            startActivity(i)
            this.finish()

        }
        else
        {



            var i=Intent(applicationContext,LoginActivity::class.java)
            startActivity(i)
            this.finish()

        }


        this.finish()
    }
}