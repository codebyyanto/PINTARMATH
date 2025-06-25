package com.view.pintarmath

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Main_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Tampilkan Beranda_Fragment saat pertama kali dibuka
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Beranda_Fragment())
                .commit()
        }

        // Inisialisasi ID
                val settingIcon = findViewById<ImageView>(R.id.ic_setting)
        val profilIcon = findViewById<ImageView>(R.id.ic_profil)

        // Event Klik
        settingIcon.setOnClickListener {
            startActivity(Intent(this, Setting_Activity::class.java))
        }


        profilIcon.setOnClickListener {
            startActivity(Intent(this, Profil_Activity::class.java))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}