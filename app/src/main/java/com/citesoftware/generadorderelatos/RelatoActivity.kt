package com.citesoftware.generadorderelatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.widget.TextView
import kotlin.random.Random

class RelatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relato)

        if(intent.getBooleanExtra("Momento", false)){
            findViewById<TextView>(R.id.tvMomentoGenerado).text = generarMomento()
        }else{
            findViewById<TextView>(R.id.tvMomentoGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Ubicacion", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Personaje", false)){
            findViewById<TextView>(R.id.tvPersonajeGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvPersonajeGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Accion", false)){
            findViewById<TextView>(R.id.tvAccionGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvAccionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Objeto", false)){
            findViewById<TextView>(R.id.tvObjetoGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvObjetoGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Detalle", false)){
            findViewById<TextView>(R.id.tvDetalleGenerado).text = "Si pa"
        }else{
            findViewById<TextView>(R.id.tvDetalleGenerado).visibility = GONE
        }
    }

    fun generarMomento(): String {

        val momentosTodos = listOf("a", "b", "c", "d")

        val randint = Random.nextInt(momentosTodos.size)

        return momentosTodos[randint]
    }

}