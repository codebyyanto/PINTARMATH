package com.view.pintarmath

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Main_Activity : AppCompatActivity() {

    private lateinit var homeIcon: ImageView
    private lateinit var settingIcon: ImageView
//    private lateinit var qrIcon: ImageView
    private lateinit var riwayatIcon: ImageView
    private lateinit var profilIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


//        SEMUA FUNGSI UNTUK BOTTOM NAVIGASI
        // Inisialisasi ID
        homeIcon = findViewById(R.id.ic_home)
        settingIcon = findViewById(R.id.ic_setting)
//        qrIcon = findViewById(R.id.ic_qr)
        riwayatIcon = findViewById(R.id.ic_riwayat)
        profilIcon = findViewById(R.id.ic_profil)

        // Tampilkan Beranda_Fragment saat pertama kali dibuka
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Beranda_Fragment())
                .commit()
            setActiveMenu(R.id.ic_home)
        }

        // Event klik Home (tampilkan fragment)
        homeIcon.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Beranda_Fragment())
                .commit()
            setActiveMenu(R.id.ic_home)
        }

        // Event klik Setting (pindah activity)
        settingIcon.setOnClickListener {
            setActiveMenu(R.id.ic_setting)
            startActivity(Intent(this, Setting_Activity::class.java))
        }

//        // Event klik scan soal (pindah activity)
//        qrIcon.setOnClickListener {
//            setActiveMenu(R.id.ic_qr)
//            startActivity(Intent(this, ScanSoal_Fragment::class.java))
//        }

        // Event klik Riwayat (pindah activity)
        riwayatIcon.setOnClickListener {
            setActiveMenu(R.id.ic_riwayat)
            startActivity(Intent(this, Riwayat_Fragment::class.java))
        }

        // Event klik Profil (pindah activity)
        profilIcon.setOnClickListener {
            setActiveMenu(R.id.ic_profil)
            startActivity(Intent(this, Profil_Activity::class.java))
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun setActiveMenu(activeId: Int) {
        // Reset ikon ke warna hitam
        val defaultColor = ContextCompat.getColor(this, android.R.color.black)
        val activeColor = ContextCompat.getColor(this, R.color.white)

        homeIcon.setColorFilter(defaultColor)
        settingIcon.setColorFilter(defaultColor)
//        qrIcon.setColorFilter(defaultColor)
        riwayatIcon.setColorFilter(defaultColor)
        profilIcon.setColorFilter(defaultColor)

        when (activeId) {
            R.id.ic_home -> homeIcon.setColorFilter(activeColor)
            R.id.ic_setting -> settingIcon.setColorFilter(activeColor)
//            R.id.ic_qr -> qrIcon.setColorFilter(activeColor)
            R.id.ic_riwayat -> riwayatIcon.setColorFilter(activeColor)
            R.id.ic_profil -> profilIcon.setColorFilter(activeColor)
        }
    }

    fun showBottomNav() {
        val bottomNav = findViewById<View>(R.id.bottom_navigation_bar)
        bottomNav.visibility = View.VISIBLE
    }

    fun hideBottomNav() {
        val bottomNav = findViewById<View>(R.id.bottom_navigation_bar)
        bottomNav.visibility = View.GONE
    }

}