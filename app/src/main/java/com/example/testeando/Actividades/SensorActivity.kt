package com.example.testeando.Actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testeando.R
import com.example.testeando.Adaptadores.SensorAdapter
import com.example.testeando.Sensores
import kotlinx.android.synthetic.main.activity_camara.*

class SensorActivity : AppCompatActivity() {
    var itemsSensores:ArrayList<Sensores> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor)
        addSensores()
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.adapter = SensorAdapter(itemsSensores, this)
    }

    private fun addSensores(){
            itemsSensores.add(
                Sensores(
                id = 1,
                nombre = "Sensor 01",
                horario = "",
                ubicacion = "Puerta frontal"
            )
            )
            itemsSensores.add(
                Sensores(
                id = 2,
                nombre = "Sensor 02",
                horario = "",
                ubicacion = "Puerta trasera"
            )
            )

        }
    }
