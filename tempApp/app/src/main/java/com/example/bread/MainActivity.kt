package com.example.bread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.Group
import com.example.bread.entity.Player

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeMessage = findViewById<TextView>(R.id.welcome_message)
        val inputName = findViewById<EditText>(R.id.username)
        val nextButton = findViewById<Button>(R.id.main_button)

        nextButton.setOnClickListener{
            Intent(this, GameActivity::class.java).also {
                startActivity(it)
            }
        }

//        nextButton.setOnClickListener {
//            val input = inputName.text.toString()
//            if(input == "") {
//                Toast.makeText(
//                    this@MainActivity,
//                    "Please enter your name",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else {
//                // Construct new Player Object
//                // (?)  Do this in Next Activity Screen?
//                val player = Player(input)
//
//                val message = "Welcome ${player.name}!"
//                welcomeMessage.text = message
//                nextButton.visibility = View.INVISIBLE
//
//                val infoUser = findViewById<TextView>(R.id.info_username)
//                val infoLvl = findViewById<TextView>(R.id.info_level)
//                val infoMoney = findViewById<TextView>(R.id.info_money)
//                val m1 = "Name: ${player.name}"
//                val m2 = "Level: ${player.level}"
//                val m3 = "Money: ${player.money}"
//
//                infoUser.text = m1
//                infoLvl.text = m2
//                infoMoney.text = m3
//
//                infoUser.visibility = View.VISIBLE
//                infoLvl.visibility = View.VISIBLE
//                infoMoney.visibility = View.VISIBLE
//
//            }
//        }
    }
}