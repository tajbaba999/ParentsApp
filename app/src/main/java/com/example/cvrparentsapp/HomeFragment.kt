package com.example.cvrparentsapp

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var StdmarksLsit: ArrayList<Stdmarks>
    private lateinit var stdAdapter: StdmarksAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val circularProgressBar = view.findViewById<CircularProgressBar>(R.id.circularProgressBar)

        circularProgressBar.apply {
            progress = 100f
            setProgressWithAnimation(75f, 1000)
            progressBarWidth = 5f
            backgroundProgressBarWidth = 7f
            progressBarColor = Color.BLUE
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    private fun addDataToList() {
        StdmarksLsit.add(Stdmarks("1", "1", "maths", "53", "physics", "23", "chemistry", "22", "CA", "67", "CADA", "34"))
        StdmarksLsit.add(Stdmarks("1", "2", "bioligy", "23", "Java", "43", "python", "42", "ED", "56", "It", "14"))
        StdmarksLsit.add(Stdmarks("2", "1", "M1", "34", "M2", "453", "P&s", "62", "BACD", "46", "BEE", "54"))
    }

    private fun init(view: View) {
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        val snapHelper : SnapHelper =LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        StdmarksLsit = ArrayList()

        addDataToList()
        stdAdapter = StdmarksAdapter(StdmarksLsit)
        recyclerView.adapter = stdAdapter
    }
}
