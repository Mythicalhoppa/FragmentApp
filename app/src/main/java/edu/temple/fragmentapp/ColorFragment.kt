package edu.temple.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.Color


class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            setOnClickListener {
                setBackgroundColor(Color.parseColor(arrayOf("Red", "Yellow", "Blue",
                    "Magenta", "Teal", "LightGray", "DarkGray", "Cyan").random()))
            }
        }
    }
}