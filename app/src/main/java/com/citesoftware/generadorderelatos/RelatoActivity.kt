package com.citesoftware.generadorderelatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RelatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relato)

        if(intent.getBooleanExtra("Momento", false)){
            findViewById<TextView>(R.id.tvMomentoGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvMomentoGenerado).text = "No pa"
        }

        if(intent.getBooleanExtra("Ubicacion", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "No pa"
        }

        if(intent.getBooleanExtra("Personaje", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "No pa"
        }

        if(intent.getBooleanExtra("Accion", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "No pa"
        }

        if(intent.getBooleanExtra("Objeto", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "No pa"
        }

        if(intent.getBooleanExtra("Detalle", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "No pa"
        }
    }
}