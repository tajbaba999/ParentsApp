package com.example.cvrparentsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class StdmarksAdapter (private val stdmarks: List<Stdmarks>) : RecyclerView.Adapter<StdmarksAdapter.StdMarksViewHolder>() {

    class StdMarksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val year : TextView = itemView.findViewById(R.id.year)
        val sem : TextView = itemView.findViewById(R.id.sem)
        val subjectonename : TextView = itemView.findViewById(R.id.subjectonename)
        val subjectonemarks : TextView = itemView.findViewById(R.id.subjectonemarks)
        val subjecttwoname : TextView = itemView.findViewById(R.id.subjecttwoname)
        val subjecttwomarks : TextView = itemView.findViewById(R.id.subjecttwomarks)
        val subjectthreename : TextView = itemView.findViewById(R.id.subjectthreename)
        val subjectthreemarks : TextView = itemView.findViewById(R.id.subjectthreemarks)
        val subjectfourname : TextView = itemView.findViewById(R.id.subjectfourname)
        val subjectfourmarks : TextView = itemView.findViewById(R.id.subjectfourmarks)
        val subjectfivename : TextView = itemView.findViewById(R.id.subjectfivename)
        val subjectfivemarks : TextView = itemView.findViewById(R.id.subjectfivemarks)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StdMarksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return StdMarksViewHolder(view)
    }

    override fun getItemCount(): Int {
       return stdmarks.size
    }

    override fun onBindViewHolder(holder: StdMarksViewHolder, position: Int) {
        val marks = stdmarks[position]

        holder.sem.text = marks.sem
        holder.year.text = marks.year
        holder.subjectonename.text = marks.subjectonename
        holder.subjectonemarks.text = marks.subjectonemarks
        holder.subjecttwoname.text = marks.subjecttwoname
        holder.subjecttwomarks.text = marks.subjecttwomarks
        holder.subjectthreename.text = marks.subjectthreename
        holder.subjectthreemarks.text = marks.subjectthreemarks
        holder.subjectfourname.text = marks.subjectfourname
        holder.subjectfourmarks.text = marks.subjectfourmarks
        holder.subjectfivename.text = marks.subjectfivename
        holder.subjectfivemarks.text = marks.subjectfivemarks
    }
}