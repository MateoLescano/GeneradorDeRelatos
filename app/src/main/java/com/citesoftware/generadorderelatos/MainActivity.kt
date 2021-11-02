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
                switchRoF.text = getString(R.string.Realismo)
            }else{
                switchRoF.text = getString(R.string.Fantasia)
            }
        }


        findViewById<Button>(R.id.btnGenerar).setOnClickListener {

            val RoF = switchRoF.isChecked
            val Momento = findViewById<SwitchCompat>(R.id.switchMomento).isChecked
            val Ubicacion = findViewById<SwitchCompat>(R.id.switchUbicacion).isChecked
            val Locacion = findViewById<SwitchCompat>(R.id.switchDetalle).isChecked
            val Personaje = findViewById<SwitchCompat>(R.id.switchPersonaje).isChecked
            val Evento = findViewById<SwitchCompat>(R.id.switchAccion).isChecked
            val Objeto = findViewById<SwitchCompat>(R.id.switchObjeto).isChecked



            val intent = Intent(this, RelatoActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("RoF", RoF)
            intent.putExtra("Momento", Momento)
            intent.putExtra("Ubicacion", Ubicacion)
            intent.putExtra("Locacion", Locacion)
            intent.putExtra("Personaje", Personaje)
            intent.putExtra("Evento", Evento)
            intent.putExtra("Objeto", Objeto)


            if(Momento || Ubicacion || Locacion || Personaje || Evento || Objeto ){
                this.startActivity(intent)
            }else{
                Toast.makeText(this,getString(R.string.sinConsigna),Toast.LENGTH_LONG).show()
            }


        }

    }


}