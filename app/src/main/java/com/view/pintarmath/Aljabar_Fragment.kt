package com.view.pintarmath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// Parameters for passing data to the fragment
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Aljabar_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Aljabar_Fragment : Fragment() {

    // Parameters to hold the passed data
    private var param1: String? = null
    private var param2: String? = null

    // onCreate: Retrieve the parameters passed to the fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    // onCreateView: Inflate the layout for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aljabar, container, false)
    }

    companion object {
        /**
         * Factory method to create a new instance of this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AljabarFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Aljabar_Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
