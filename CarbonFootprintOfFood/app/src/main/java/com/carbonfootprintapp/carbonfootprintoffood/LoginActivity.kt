package com.carbonfootprintapp.carbonfootprintoffood

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goToMealEntry(view: View) {
        val intent = Intent(view.getContext(), MealEntryActivity::class.java)
        view.getContext().startActivity(intent)
    }
}
