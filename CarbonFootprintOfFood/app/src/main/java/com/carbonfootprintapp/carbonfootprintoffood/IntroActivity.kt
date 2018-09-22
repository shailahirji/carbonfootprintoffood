package com.carbonfootprintapp.carbonfootprintoffood

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.View
import android.support.v4.content.ContextCompat.startActivity

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }

    fun goToLogin(view: View) {
        val intent = Intent(view.getContext(), LoginActivity::class.java)
        view.getContext().startActivity(intent)
    }
}
