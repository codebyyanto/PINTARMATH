package com.view.pintarmath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Materi1_Kalkulus_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_materi1__diskrit, container, false)

        // Tombol kembali
        val backButton = view.findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Kalkulus_Fragment())
                .commit()
        }

        return view
    }
}
