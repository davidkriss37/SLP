package com.e.clickergame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
var money = 0
var money2 = 0
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var click = findViewById<Button>(R.id.clickid)
        click.setOnClickListener{
            money+=1
            var score : TextView = findViewById(R.id.moneyviewthe1)
            score.setText(money.toString())
        }
        var go = findViewById<Button>(R.id.go2buy)
        go.setOnClickListener {
            var move2buy = Intent(getApplicationContext(), buyActivity::class.java)
            startActivity(move2buy)
        }
        var go2up = findViewById<Button>(R.id.go2up)
        go2up.setOnClickListener {
            var move2up = Intent(getApplicationContext(), upActivity::class.java)
            startActivity(move2up)
        }
        var go2set = findViewById<Button>(R.id.go2set)
        go2set.setOnClickListener {
            var move2set = Intent(getApplicationContext(), setActivity::class.java)
            startActivity(move2set)
        }
    }
}
