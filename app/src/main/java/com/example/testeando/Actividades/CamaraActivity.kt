package com.example.testeando.Actividades

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testeando.Adaptadores.CameraAdapter
import com.example.testeando.Camera
import com.example.testeando.R
import com.example.testeando.Sensores
import kotlinx.android.synthetic.main.activity_camara.*
import kotlinx.android.synthetic.main.test_camera.*

class CamaraActivity : AppCompatActivity() {
    var itemsCamera:ArrayList<Camera> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camara)
        newCameras()

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.adapter = CameraAdapter(itemsCamera, this)

        //videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.f1))
        //videoView.start()
        //webview.settings.javaScriptEnabled = true;


        //webview.webViewClient = WebViewClient()
        //webview.loadUrl("https://youtu.be/Khf_j47GZgM")

        //videoview1.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.g1))
        //videoview1.start()
        //val mediaController = MediaController(this)
        //videoview1.setMediaController(mediaController)


    }

    private fun newCameras(){
        itemsCamera.add(
            Camera(
                titulo = "Camara 01",
                id = 1,
                img = R.drawable.video_capture,
                icon = R.drawable.pause
            )
        )
        itemsCamera.add(
            Camera(
                titulo = "Camara 02",
                id = 2,
                img = R.drawable.nodisponible
            )
        )
        itemsCamera.add(
            Camera(
                titulo = "Camara 03",
                id = 3,
                img = R.drawable.nodisponible
            )
        )
        itemsCamera.add(
            Camera(
                titulo = "Camara 04",
                id = 4,
                img = R.drawable.nodisponible
            )
        )
        itemsCamera.add(
            Camera(
                titulo = "Camara 05",
                id = 5,
                img = R.drawable.nodisponible
            )
        )
    }
}
