package com.example.testeando.Adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testeando.R
import com.example.testeando.Sensores


class SensorAdapter(val items:ArrayList<Sensores>, val context: Context): RecyclerView.Adapter<SensorAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sensor, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val sensor = items[position]
        holder.bind(sensor)

    }
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val titulo_sensor: TextView = itemView.findViewById(R.id.titulo_sensor)
        private val ubicacion_sensor: TextView = itemView.findViewById(R.id.ubicacion_sensor)
        fun bind(sensor: Sensores) {
            titulo_sensor.text = sensor.nombre
            ubicacion_sensor.text = sensor.ubicacion

        }
    }

}