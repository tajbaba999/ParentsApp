package com.example.cvrparentsapp

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val circularProgressBar = view.findViewById<CircularProgressBar>(R.id.circularProgressBar)

        circularProgressBar.apply {
            progress = 100f
            setProgressWithAnimation(75f,1000)
            progressBarWidth = 5f
            backgroundProgressBarWidth = 7f
            progressBarColor = Color.BLUE

        }



        return view
    }

}