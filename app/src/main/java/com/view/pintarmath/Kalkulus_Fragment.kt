package com.view.pintarmath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class Kalkulus_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_kalkulus, container, false)

        // Sembunyikan bottom navigation
        (activity as? Main_Activity)?.hideBottomNav()

        // Tombol kembali
        val backButton = view.findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            // Ganti fragment kembali ke Beranda
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Beranda_Fragment())
                .commit()
        }

        //Materi 1
        val btnMateri1 = view.findViewById<Button>(R.id.btn_materi1)

        btnMateri1.setOnClickListener {
            // Navigasi ke Materi1_Kalkulus_Fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Materi1_Kalkulus_Fragment())
                .addToBackStack(null)
                .commit()
        }

        //Materi 1
        val btnMateri2 = view.findViewById<Button>(R.id.btn_materi2)

        btnMateri2.setOnClickListener {
            // Navigasi ke Materi2_Kalkulus_Fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Materi2_Kalkulus_Fragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}