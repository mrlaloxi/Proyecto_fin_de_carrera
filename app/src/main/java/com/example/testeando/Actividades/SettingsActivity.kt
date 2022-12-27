package com.example.testeando.Actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testeando.R
import com.example.testeando.Adaptadores.SettingAdapter
import kotlinx.android.synthetic.main.activity_camara.*

class SettingsActivity : AppCompatActivity() {
    var itemsSettings:ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        addSettings()
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.adapter = SettingAdapter(itemsSettings, this)
    }
    private fun addSettings(){
        itemsSettings.add("General")
        itemsSettings.add("Notificaciones")
        itemsSettings.add("Data & Sync")

    }

}