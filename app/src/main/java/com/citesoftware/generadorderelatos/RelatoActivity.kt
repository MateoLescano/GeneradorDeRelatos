package com.citesoftware.generadorderelatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        if(intent.getBooleanExtra("Momento", false)) {


            val momentosPrehistoria = listOf("1","3","5")
            val momentosModernidad = listOf("2","4","6")
            val momentosContemporanea = listOf("01","02","03")
            val momentosFuturismo = listOf("001","002","003")

            val randint1 = Random.nextInt(1,5)
            Log.d("AAA",randint1.toString())

            val momentos: MutableList<String> = ArrayList()

            when(randint1){

                1 -> momentos.addAll(momentosPrehistoria)

                2 -> momentos.addAll(momentosModernidad)

                3 -> momentos.addAll(momentosContemporanea)

                4 -> momentos.addAll(momentosFuturismo)
            }


            val randint2 = Random.nextInt(momentos.size)

            return momentos[randint2]
        }else{

            val momentosTodos = listOf("a", "b", "c", "d")

            val randint = Random.nextInt(momentosTodos.size)

            return momentosTodos[randint]
        }
    }

}