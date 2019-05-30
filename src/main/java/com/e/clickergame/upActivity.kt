package com.e.clickergame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class upActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_up)
        var score1 : TextView = findViewById(R.id.display)
        score1.setText(money.toString())
    }
}
