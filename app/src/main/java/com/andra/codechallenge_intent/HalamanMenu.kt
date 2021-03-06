package com.andra.codechallenge_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_menu.*

class HalamanMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_menu)

        val bundle = intent.extras
        val outputNama = bundle!!.getString("nama")

        username.setText("$outputNama")

        iv_hal_1.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}