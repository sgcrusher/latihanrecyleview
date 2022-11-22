package com.example.latihanrecyleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciserecyclerview.JobHero
import java.security.AccessControlContext
import java.util.EventListener

class JobHeroAdapter(private val context:Context, private val JobHero: List<JobHero>, val listener: (JobHero) -> Unit)
    : RecyclerView.Adapter<JobHeroAdapter.JobHeroViewHolder>() {

    class JobHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgjobHero = view.findViewById<ImageView>(R.id.img_item_photo)
        val namajobhero = view.findViewById<TextView>(R.id.tv_item_name)
        val deksripsiJob = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(jobHero: JobHero, listener: (JobHero) -> Unit){
            imgjobHero.setImageResource(jobHero.imgjobHero)
            namajobhero.text = jobHero.namajobhero
            deksripsiJob.text = jobHero.deksripsiJob
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobHeroViewHolder {
        return JobHeroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.layout_jobhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: JobHeroViewHolder, position: Int) {
    holder.bindView(JobHero[position], listener)
    }

    override fun getItemCount(): Int = JobHero.size
    }