package com.view.pintarmath

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.TextView




class Register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val loginLink = findViewById<TextView>(R.id.textView8)
        loginLink.setOnClickListener {
            val intent = Intent(this, Login_Activity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}
