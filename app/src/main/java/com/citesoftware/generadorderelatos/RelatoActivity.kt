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
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Ubicación: " + generarUbicacion()
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Personaje", false)){
            findViewById<TextView>(R.id.tvPersonajeGenerado).text = "Personaje: " + generarPersonaje()
        }else{
            findViewById<TextView>(R.id.tvPersonajeGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Accion", false)){
            findViewById<TextView>(R.id.tvAccionGenerado).text = "Acción: " + generarAccion()
        }else{
            findViewById<TextView>(R.id.tvAccionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Objeto", false)){
            findViewById<TextView>(R.id.tvObjetoGenerado).text = "Objeto: " + generarObjeto()
        }else{
            findViewById<TextView>(R.id.tvObjetoGenerado).visibility = GONE
        }

//        if(intent.getBooleanExtra("Detalle", false)){
//            findViewById<TextView>(R.id.tvDetalleGenerado).text = "Si pa"
//        }else{
//            findViewById<TextView>(R.id.tvDetalleGenerado).visibility = GONE
//        }
    }

    fun generarMomento(): String {

        val momentosTodos = listOf("Paleolítico", "Neolítico","Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.", "La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití","La época de construcción de templos budistas en Asia", "La revolución de Haití","Dictadura Chilena en 1970","Dictadura Argentina en 1976","Crisis Argentina del 2001","Gobierno de Menem","Tercer gobierno Peronista","Gobierno de Juan Manuel de Rosas","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","Un universo donde se fuma marihuana para estar sobrio", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

        val randint = Random.nextInt(momentosTodos.size)

        return momentosTodos[randint]

    }

    fun generarUbicacion(): String {

        val momentosTodos = listOf("Paleolítico", "Neolítico","Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.", "La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití","La época de construcción de templos budistas en Asia", "La revolución de Haití","Dictadura Chilena en 1970","Dictadura Argentina en 1976","Crisis Argentina del 2001","Gobierno de Menem","Tercer gobierno Peronista","Gobierno de Juan Manuel de Rosas","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","Un universo donde se fuma marihuana para estar sobrio", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

        val randint = Random.nextInt(momentosTodos.size)

        return momentosTodos[randint]

    }

    fun generarPersonaje(): String {

        val momentosTodos = listOf("Paleolítico", "Neolítico","Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.", "La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití","La época de construcción de templos budistas en Asia", "La revolución de Haití","Dictadura Chilena en 1970","Dictadura Argentina en 1976","Crisis Argentina del 2001","Gobierno de Menem","Tercer gobierno Peronista","Gobierno de Juan Manuel de Rosas","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","Un universo donde se fuma marihuana para estar sobrio", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

        val randint = Random.nextInt(momentosTodos.size)

        return momentosTodos[randint]

    }

    fun generarAccion(): String {

        val momentosTodos = listOf("Paleolítico", "Neolítico","Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.", "La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití","La época de construcción de templos budistas en Asia", "La revolución de Haití","Dictadura Chilena en 1970","Dictadura Argentina en 1976","Crisis Argentina del 2001","Gobierno de Menem","Tercer gobierno Peronista","Gobierno de Juan Manuel de Rosas","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","Un universo donde se fuma marihuana para estar sobrio", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

        val randint = Random.nextInt(momentosTodos.size)

        return momentosTodos[randint]

    }

    fun generarObjeto(): String {

        val momentosTodos = listOf("Paleolítico", "Neolítico","Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.", "La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití","La época de construcción de templos budistas en Asia", "La revolución de Haití","Dictadura Chilena en 1970","Dictadura Argentina en 1976","Crisis Argentina del 2001","Gobierno de Menem","Tercer gobierno Peronista","Gobierno de Juan Manuel de Rosas","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","Un universo donde se fuma marihuana para estar sobrio", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

        val randint = Random.nextInt(momentosTodos.size)

        return momentosTodos[randint]

    }

}