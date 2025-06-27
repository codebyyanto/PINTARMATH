package com.view.pintarmath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class Beranda_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout fragment_beranda.xml
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        //menampilakan bottom navigasi
        (activity as? Main_Activity)?.showBottomNav()

        // Cari ImageView kalkulus
        val kalkulusImage = view.findViewById<ImageView>(R.id.kalkulus)

        // Tambahkan event klik
        kalkulusImage.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Kalkulus_Fragment())
                .addToBackStack(null) // Supaya bisa kembali
                .commit()
        }

        // Cari ImageView Diskrit
        val diskritImage = view.findViewById<ImageView>(R.id.diskrit)
        diskritImage.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Diskrit_Fragment())
                .addToBackStack(null)
                .commit()
        }


        return view
    }
}


