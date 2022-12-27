package com.example.testeando.Adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testeando.R


class SettingAdapter(val items:ArrayList<String>, val context: Context): RecyclerView.Adapter<SettingAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_settings, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.propiedad?.text = items.get(position)

    }
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var propiedad: TextView= itemView.findViewById(R.id.propiedad)
    }

}