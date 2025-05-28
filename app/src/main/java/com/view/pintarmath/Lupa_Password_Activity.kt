package com.view.pintarmath

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lupa_Password_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lupa_password)


        //  event untuk button kirim
        // Inisialisasi Button "Kirim"
        val buttonKirim = findViewById<Button>(R.id.btn_kirim)

        // Event klik untuk Button "Kirim"
        buttonKirim.setOnClickListener {
            Toast.makeText(this, "Email telah dikirim", Toast.LENGTH_SHORT).show()
        }


        //  event untuk text "Login" pada kalimat sudah punya akun?Login
        // Inisialisasi TextView "Login"
        val klikLoginLupaPw = findViewById<TextView>(R.id.klik_login_lupa_pw)

        // Event klik: Arahkan ke Login_Activity2 saat TextView "Login" diklik
        klikLoginLupaPw.setOnClickListener {
            val intent = Intent(this, Login_Activity2::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}