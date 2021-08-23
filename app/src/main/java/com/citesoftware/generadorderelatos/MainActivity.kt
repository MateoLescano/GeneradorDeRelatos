package com.citesoftware.generadorderelatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        findViewById<Button>(R.id.btnGenerar).setOnClickListener {

            val RoF = findViewById<Switch>(R.id.switchFantasia).isChecked
            val Momento = findViewById<Switch>(R.id.switchMomento).isChecked
            val Ubicacion = findViewById<Switch>(R.id.switchUbicacion).isChecked
            val Personaje = findViewById<Switch>(R.id.switchPersonaje).isChecked
            val Accion = findViewById<Switch>(R.id.switchAccion).isChecked
            val Objeto = findViewById<Switch>(R.id.switchObjeto).isChecked
            val Detalle = findViewById<Switch>(R.id.switchDetalle).isChecked



            val intent = Intent(this, RelatoActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//            intent.putExtra("RoF", RoF)
            intent.putExtra("Momento", Momento)
            intent.putExtra("Ubicacion", Ubicacion)
            intent.putExtra("Personaje", Personaje)
            intent.putExtra("Accion", Accion)
            intent.putExtra("Objeto", Objeto)
            intent.putExtra("Detalle", Detalle)

            this.startActivity(intent)
        }

    }


}