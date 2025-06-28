package com.view.pintarmath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class Diskrit_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Sembunyikan bottom navigation
        (activity as? Main_Activity)?.hideBottomNav()

        val view = inflater.inflate(R.layout.fragment_diskrit, container, false)

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
            // Navigasi ke Materi1_Diskrit_Fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Materi1_Diskrit_Fragment())
                .addToBackStack(null)
                .commit()
        }

        //Materi 2
        val btnMateri2 = view.findViewById<Button>(R.id.btn_materi2)

        btnMateri2.setOnClickListener {
            // Navigasi ke Materi2_Diskrit_Fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Materi2_Diskrit_Fragment())
                .addToBackStack(null)
                .commit()
        }

        //Materi 3
        val btnMateri3 = view.findViewById<Button>(R.id.btn_materi3)

        btnMateri3.setOnClickListener {
            // Navigasi ke Materi3_Diskrit_Fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Materi3_Diskrit_Fragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
