package com.umojafemspace

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val welcome = TextView(this)
        welcome.text = "Umoja Femspace\nStart • Scale • Succeed"
        welcome.textSize = 24f

        setContentView(welcome)
    }
}
