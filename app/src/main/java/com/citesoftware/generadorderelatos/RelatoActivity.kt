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
            findViewById<TextView>(R.id.tvMomentoGenerado).text = "Momento Historico: " + generarMomento()
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

        if(!intent.getBooleanExtra("RoF", false)) {


            val momentosPrehistoria = listOf("Paleolítico", "Neolítico","Invención de la escritura.","Antiguo Egipto.","Construcción de las pirámides de Giza.","Antigua Grecia.",
                "Construcción del partenón.","Imperio Romano.","Mayas periodo Preclásico.","Teatro antiguo.","Época oscura.","Guerra del Peloponeso.","Imperio Persa.","Imperio parto.","Juegos olímpicos.",
                "Erupción del Monte Vesubio.","Juicio a Sócrates.")

            val momentosModernidad = listOf("Imperio Bizantino.","Renacimiento.","Imperio Otomano.","Descubrimiento de América.","Caída del imperio bizantino.","Teatro medieval.","Guerra de los 100 años.","Feudalismo.","La peste negra.","Imperio Carolingio.",
                "El año mil.","Cometa Halley.","Alta edad media.","Baja edad media.", "Dinámica año 1118","La revolución Francesa.","Barroco.","Edad de oro neerlandesa.","Rococó","Teatro de la edad moderna.",
                "Declaración de la independencia Estadounidense.","La revolución de Haití.","Renacimiento.","La época de construcción de templos budistas en Asia: monjes, iluminación, etc. entre el siglo IX y XV",
                "Austria 1354")

            val momentosContemporanea = listOf("La revolución de Haití.","Dictadura Chilena 70.","Dictadura Argentina 76.","Dictadura Argentina","Crisis 2001.","Menemismo.","Tercer gobierno Peronista.","Dictadura de Onganía.","Gobierno de Ilia.",
                "Primer mandato Peronista.","Golpe de Uriburu.","Gobiernos radicales.","La campaña del desierto.","Gobierno de Juan Manuel de Rosas.","Guerra de Malvinas.","Cordobazo.","Batalla de Caseros.",
                "Argentina mundial 86.","Argetina mundial 78.","Revolución de Noviembre.","Revolución de Asturias.","Revolución Rusa.","Revolución Cubana.","Levantamiento del 2 de Mayo.","Revolución Mexicana.",
                "Revolución China.","Revolución de los Claveles.","Revolución industrial.","Cine mudo.","Cine sonoro.","Romanticismo.","Realismo.","Impresionismo.","Neoimpresionismo.","Art Nouveau.","Teatro contemporáneo.",
                "Expresionismo.","Fauvismo.","Cubismo.","Futurismo.","Suprematismo.","Dadaísmo.","Neoplasticismo.","Realismo mágico.","Colour Field.","Pop art.","Performance art.","Minimalismo.","Arte conceptual.",
                "Surrealismo.","Boom latinoamericano.","Crisis economica del 30.","La revolución Francesa.","Segunda guerra mundial.","Primera guerra mundial.","Revolución de Mayo.","Invención del smartphone.",
                "Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 70.","Crisis del 2008.","Crisis de España.","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.",
                "Hippismo.","Punk.","La invasión británica.","Nelson Mandela.","Juicio a las Fuerzas armadas.","Cometa Halley.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.",
                "El hombre llega a la Luna.","Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","La Shoa.",
                "Un universo donde se fuma marihuana para estar sobrio","La mañana que Bob Marley escribió No Woman No Cry","Nueva York, 2020")

            val momentosFuturismo = listOf("Cometa Halley SXXI.","Tercera guerra mundial.","Crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.",
                "Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

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

            val momentosTodos = listOf("Paleolítico", "Neolítico","Invención de la escritura.","Antiguo Egipto.","Construcción de las pirámides de Giza.","Antigua Grecia.",
            "Construcción del partenón.","Imperio Romano.","Imperio Maya","Teatro antiguo.","Época oscura.","Guerra del Peloponeso.","Imperio Persa.","Imperio parto.","Juegos olímpicos.",
            "Erupción del Monte Vesubio.","Juicio a Sócrates.",

                "Imperio Bizantino.","Renacimiento.","Imperio Otomano.","Descubrimiento de América.","Caída del imperio bizantino.","Teatro medieval.","Guerra de los 100 años.",
            "Feudalismo.","La peste negra.","Imperio Carolingio.","El año mil.","Cometa Halley.","Alta edad media.","Baja edad media.", "Dinámica año 1118","La revolución Francesa.","Barroco.","Edad de oro neerlandesa.",
            "Rococó","Teatro de la edad moderna.","Declaración de la independencia Estadounidense.","La revolución de Haití.","Renacimiento.","La época de construcción de templos budistas en Asia: monjes, iluminación, etc. entre el siglo IX y XV",
            "Austria 1354", "La revolución de Haití.","Dictadura Chilena 70.","Dictadura Argentina 76.","Dictadura Argentina","Crisis 2001.","Menemismo.","Tercer gobierno Peronista.","Dictadura de Onganía.","Gobierno de Ilia.",
            "Primer mandato Peronista.","Golpe de Uriburu.","Gobiernos radicales.","La campaña del desierto.","Gobierno de Juan Manuel de Rosas.","Guerra de Malvinas.","Cordobazo.","Batalla de Caseros.","Argentina mundial 86.",
            "Argetina mundial 78.","Revolución de Noviembre.","Revolución de Asturias.","Revolución Rusa.","Revolución Cubana.","Levantamiento del 2 de Mayo.","Revolución Mexicana.","Revolución China.",
            "Revolución de los Claveles.","Revolución industrial.","Cine mudo.","Cine sonoro.","Romanticismo.","Realismo.","Impresionismo.","Neoimpresionismo.","Art Nouveau.","Teatro contemporáneo.","Expresionismo.",
            "Fauvismo.","Cubismo.","Futurismo.","Suprematismo.","Dadaísmo.","Neoplasticismo.","Realismo mágico.","Colour Field.","Pop art.","Performance art.","Minimalismo.","Arte conceptual.","Surrealismo.",
            "Boom latinoamericano.","Crisis economica del 30.","La revolución Francesa.","Segunda guerra mundial.","Primera guerra mundial.","Revolución de Mayo.","Invención del smartphone.","Inteligencia artificial.",
            "Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 70.","Crisis del 2008.","Crisis de España.","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Punk.",
            "La invasión británica.","Nelson Mandela.","Juicio a las Fuerzas armadas.","Cometa Halley.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.",
            "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","La Shoa.","Un universo donde se fuma marihuana para estar sobrio",
            "La mañana que Bob Marley escribió No Woman No Cry","Nueva York, 2020", "Cometa Halley SXXI.","Tercera guerra mundial.","Crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.",
            "Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan",
            "Descubren vida extraterrestre, año 2038", "Guerra Civil EEUU")

            val randint = Random.nextInt(momentosTodos.size)

            return momentosTodos[randint]
        }
    }

}