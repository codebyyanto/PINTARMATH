package com.view.pintarmath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class Aljabar_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_aljabar, container, false)

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

        return view
    }
}
