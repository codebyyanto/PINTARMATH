package com.view.pintarmath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login_Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)

        // Inisialisasi tombol login
        val loginButton = findViewById<Button>(R.id.btn_login)
        loginButton.setOnClickListener {
            // Aksi ketika tombol login diklik
            val intent = Intent(this, Main_Activity::class.java)
            startActivity(intent)
        }

        // Mengatur padding agar layout tidak tertutup oleh status/navigation bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
