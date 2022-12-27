package com.example.testeando.Adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testeando.Camera
import com.example.testeando.R
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_camera.view.*

class CameraAdapter(val items:ArrayList<Camera>, val context: Context):RecyclerView.Adapter<CameraAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_camera, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val camera = items.get(position)
        holder.bind(camera)
    }
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        private val Cameraview:ImageView = itemView.findViewById(R.id.Cameraview)
        private val iconView:ImageView = itemView.findViewById(R.id.fab)
        private val titulo_camera:TextView = itemView.findViewById(R.id.titulo_camera)
        fun bind(camera: Camera){
            titulo_camera.text = camera.titulo
            camera.img?.let { Cameraview.setImageResource(it) }
            camera.icon?.let { iconView.setImageResource(it) }
        }
    }

}