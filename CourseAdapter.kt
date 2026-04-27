package com.example.computerclassesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.computerclassesapp.R
import com.example.computerclassesapp.models.Course

class CourseAdapter(var list: MutableList<Course>) :
    RecyclerView.Adapter<CourseAdapter.ViewHolder?>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var fees: TextView

        init {
            name = itemView.findViewById<TextView>(R.id.courseName)
            fees = itemView.findViewById<TextView>(R.id.courseFees)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_course, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val c = list.get(position)
        holder.name.setText(c.name)
        holder.fees.setText(c.fees)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}