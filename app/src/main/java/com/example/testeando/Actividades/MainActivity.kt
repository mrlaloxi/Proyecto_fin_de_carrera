package com.example.testeando.Actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.testeando.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val itemsHome = arrayOf("Cámaras", "Sensores", "Settings")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    val adapter = ArrayAdapter(this, R.layout.item_home,itemsHome)
    listviewhome.adapter = adapter

    listviewhome.onItemClickListener = object : AdapterView.OnItemClickListener{
        override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            var item = listviewhome.getItemAtPosition(p2) as String
            if (item == "Cámaras"){
                val intent = Intent(this@MainActivity, CamaraActivity::class.java)
                startActivity(intent)
            }
            if (item == "Sensores"){
                val intent = Intent(this@MainActivity, SensorActivity::class.java)
                startActivity(intent)
            }
            if (item == "Settings"){
                val intent = Intent(this@MainActivity, SettingsActivity::class.java)
                startActivity(intent)
                }
            }
        }
    }


}