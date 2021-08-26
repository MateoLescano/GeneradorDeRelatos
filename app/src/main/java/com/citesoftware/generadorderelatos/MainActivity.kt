package com.citesoftware.generadorderelatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchRoF = findViewById<SwitchCompat>(R.id.switchFantasia)

        switchRoF.setOnCheckedChangeListener { _, isChecked ->
            if(switchRoF.isChecked){
                switchRoF.text = "Fantasia"
            }else{
                switchRoF.text = "Realismo"
            }
        }


        findViewById<Button>(R.id.btnGenerar).setOnClickListener {

            val RoF = switchRoF.isChecked
            val Momento = findViewById<SwitchCompat>(R.id.switchMomento).isChecked
            val Ubicacion = findViewById<SwitchCompat>(R.id.switchUbicacion).isChecked
            val Personaje = findViewById<SwitchCompat>(R.id.switchPersonaje).isChecked
            val Accion = findViewById<SwitchCompat>(R.id.switchAccion).isChecked
            val Objeto = findViewById<SwitchCompat>(R.id.switchObjeto).isChecked
            val Detalle = findViewById<SwitchCompat>(R.id.switchDetalle).isChecked



            val intent = Intent(this, RelatoActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("RoF", RoF)
            intent.putExtra("Momento", Momento)
            intent.putExtra("Ubicacion", Ubicacion)
            intent.putExtra("Personaje", Personaje)
            intent.putExtra("Accion", Accion)
            intent.putExtra("Objeto", Objeto)
            intent.putExtra("Detalle", Detalle)

            if(Momento || Ubicacion || Personaje || Accion || Objeto || Detalle){
                this.startActivity(intent)
            }else{
                Toast.makeText(this,"Por favor, elija al menos una consigna",Toast.LENGTH_LONG).show()
            }


        }

    }


}