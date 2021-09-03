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

        val tiempo = Random.nextInt(1,4)

        if(intent.getBooleanExtra("Momento", false)){
            findViewById<TextView>(R.id.tvMomentoGenerado).text = "Momento Historico: " + generarMomento(tiempo)
        }else{
            findViewById<TextView>(R.id.tvMomentoGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Ubicacion", false)){
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = "Ubicación: " + generarUbicacion(tiempo)
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Personaje", false)){
            findViewById<TextView>(R.id.tvPersonajeGenerado).text = "Personaje: " + generarPersonaje(tiempo)
        }else{
            findViewById<TextView>(R.id.tvPersonajeGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Evento", false)){
            findViewById<TextView>(R.id.tvAccionGenerado).text = "Evento: " + generarEvento()
        }else{
            findViewById<TextView>(R.id.tvAccionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Objeto", false)){
            findViewById<TextView>(R.id.tvObjetoGenerado).text = "Objeto: " + generarObjeto(tiempo)
        }else{
            findViewById<TextView>(R.id.tvObjetoGenerado).visibility = GONE
        }

//        if(intent.getBooleanExtra("Detalle", false)){
//            findViewById<TextView>(R.id.tvDetalleGenerado).text = "Si pa"
//        }else{
//            findViewById<TextView>(R.id.tvDetalleGenerado).visibility = GONE
//        }



        val actionbar = supportActionBar
        actionbar!!.title = "Tu relato"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    fun generarMomento(tiempo: Int): String {


        if(intent.getBooleanExtra("RoF", true)) {

            var lista: List<String> = emptyList()

            when(tiempo){

                1 -> lista = listOf("Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.","La época de construcción de templos budistas en Asia", "La revolución de Haití.", "Un universo donde se fuma marihuana para estar sobrio")

                2, 3 -> lista = listOf("La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití", "Dictadura Chilena en 1970.","Dictadura Argentina en 1976.","Crisis Argentina del 2001.","Gobierno de Menem.","Tercer gobierno Peronista.","Gobierno de Juan Manuel de Rosas.","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038", "Un universo donde se fuma marihuana para estar sobrio")

            }

            val randint = Random.nextInt(lista.size)

            return lista[randint]

        }else{
            val lista = listOf("Invención de la escritura","Antiguo Egipto","Construcción de las pirámides de Giza","Antigua Grecia","Construcción del partenón","Imperio Romano","Imperio Maya","Juegos olímpicos originales","Erupción del Monte Vesubio.","Juicio a Sócrates.","Renacimiento.","Imperio Otomano.","Conquista de América.","Caída del imperio bizantino.","Guerra de los 100 años.","Feudalismo.","La peste negra.", "La revolución Francesa.","Declaración de la independencia Estadounidense","La revolución de Haití","La época de construcción de templos budistas en Asia", "La revolución de Haití.","Dictadura Chilena en 1970.","Dictadura Argentina en 1976.","Crisis Argentina del 2001.","Gobierno de Menem.","Tercer gobierno Peronista.","Gobierno de Juan Manuel de Rosas.","Revolución Rusa.","Revolución Cubana.","Revolución de los Claveles.","Epoca del cine mudo.","Crisis economica del 30.","Segunda guerra mundial.","Primera guerra mundial.","Invención del smartphone.","Inteligencia artificial.","Epidemia del HIV.","Caída del muro de Berlín.","Crisis del 2008.","Crisis Española","La bomba atómica de Hiroshima/Nagasaki.","Chernobyl.","Guerra fría.","Hippismo.","Era dorada del punk.","Pandemia Covid-19.","Asesinato de John F. Kennedy.","Atentado de las torres gemelas.","El hombre llega a la Luna.", "Invención del televisor.","Estreno de 'El padrino'.", "Estreno de 'Star Wars'.","Construcción del Teatro Colón.","Un universo donde se fuma marihuana para estar sobrio", "La mañana que Bob Marley escribió No Woman No Cry","Tercera guerra mundial.","Climax de la crisis climática.","Asesinato de un presidente de la República Argentina.","Primer excursión a Marte.","Guerra del agua.","Holocausto nuclear.","Colonización del primer planeta del Imperio galáctico humano.","Los polos tras el calentamiento global siendo los únicos lugares habitables por humanos que quedan","Descubren vida extraterrestre, año 2038")

            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }

    }

    fun generarUbicacion(tiempo: Int): String {

        if(intent.getBooleanExtra("RoF", true)) {

            var lista: List<String> = emptyList()

            when(tiempo){

                1 -> lista = listOf( "Un calabozo", "Una casa alejada de todo", "Un bunker", "Un hospital", "Lisboa, Portugal", "Una ciudad desconocida", "Monte Fuji", "Dinamarca", "Una iglesia, templo o mesquita", "una taberna", "la mitad de la carretera", "Praga", "Roma", "Damasco", "Atenas, Grecia", "Cuzco", "Las piramides Egipcias")

                2, 3 -> lista = listOf("Ciudad de Buenos Aires", "Una terminal de colectivos", "Una estación de tren","Un café", "Un bagon de tren abandonado", "El andén 2 de la estación de Retiro", "Una casa alejada de todo", "Un bunker", "Praga, Republica Checa", "Un hospital", "Pyongyang, Corea del Norte", "Seúl, Corea del Sur", "Monte Fuji", "Hong Kong", "Un lugar de altura muy elevada", "Un parque de diversiones", "Un sitio abandonado", "Salto angel, Venezuela", "Un tren en movimiento", "Una ciudad desconocida", "San Petesburgo, Rusia", "Ciudad del Cabo, Sudafrica", "Estanbul, Turquía", "Lisboa, Portugal", "Dinamarca", "Una iglesia, templo o mesquita",  "la mitad de la carretera", "Praga", "Roma", "Damasco", "Atenas, Grecia", "Cuzco", "Las piramides Egipcias")

            }

            val randint = Random.nextInt(lista.size)

            return lista[randint]

        }else{
            val lista = listOf("Dinamarca", "Una iglesia, templo o mesquita", "Ciudad de Buenos Aires", "La casa de un amigo/a", "Una terminal de colectivos", "Una estación de tren", "Un calabozo", "Un café", "Un bagon de tren abandonado", "El andén 2 de la estación de Retiro", "Una casa alejada de todo", "Un bunker", "Praga, Republica Checa", "Un hospital", "Pyongyang, Corea del Norte", "Seúl, Corea del Sur", "Monte Fuji", "Hong Kong", "Un lugar de altura muy elevada", "Un parque de diversiones", "Un sitio abandonado", "Salto angel, Venezuela", "Un tren en movimiento", "Una ciudad desconocida", "San Petesburgo, Rusia", "Ciudad del Cabo, Sudafrica", "Estanbul, Turquía", "Lisboa, Portugal","una taberna",  "la mitad de la carretera", "Praga", "Roma", "Damasco", "Atenas, Grecia", "Cuzco", "Las piramides Egipcias")
            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }

    }

    fun generarPersonaje(tiempo: Int): String {

        if(intent.getBooleanExtra("RoF", true)) {

            var lista: List<String> = emptyList()

            when(tiempo){

                1 -> lista = listOf("Una persona con problemas de memoria","Un niño o niña", "Una persona con depresión", "Un viajero del tiempo", "Una persona con poderes", "Un animal", "Un ilustrador de comics", "Un teniente coronel", "Un o una adolescente", "El o la elegida", "Un par de gemelos", "Una persona con un secreto", "Un o una condenada a muerte", "Un o una prisionera",  "Un o una medica", "Un actor/actriz ", "Una o un detective",  "Un o una deportista ", "Una o un escritor ", "Una persona sin hogar", "Una persona que escapa", "Una persona desesperada", "Un o una psicopata", "Una o un asesino", "Tu personaje historico favorito ", "Tu personaje ficticio favorito")

                2, 3 -> lista = listOf("Una persona con problemas de memoria","Un niño o niña", "Una persona con depresión", "Un viajero del tiempo", "Una persona con poderes", "Un animal", "Un o una adolescente", "El o la elegida", "Un o una espia", "Un astronauta", "Un par de gemelos", "Una persona con un secreto", "Un o una condenada a muerte", "Un o una prisionera", "Un o una programadora",  "Un o una medica", "Un actor/actriz ", "Una o un detective", "Un o una medica", "Un barbero", "Una o un muralista",  "Un o una deportista ", "Una o un escritor ", "Una persona sin hogar", "Una persona que escapa", "Una persona desesperada", "Un o una psicopata", "Una o un asesino", "Tu personaje historico favorito ", "Tu personaje ficticio favorito")

            }

            val randint = Random.nextInt(lista.size)

            return lista[randint]

        }else{
            val lista = listOf("Una persona con problemas de memoria","Un niño o niña", "Una persona con depresión", "Un viajero del tiempo", "Una persona con poderes", "Un animal", "Un ilustrador de comics", "Una mujer musica", "Un teniente coronel", "Un o una adolescente", "La o el elegido", "Un o una espia", "Un o una astronauta", "Un par de gemelos", "Una persona con un secreto", "Un o una condenada a muerte", "Una o un prisionero", "Un o una programadora", "Un o una medica","Un actor/actriz ", "Una o un detective ", "Una o un candidato electoral", "Un barbero ", "Una o un muralista ", "Un o una deportista ", "Una o un escritor ", "Una persona sin hogar", "Una persona que escapa", "Una persona desesperada", "Un o una psicopata", "Una o un asesino", "Tu personaje historico favorito", "Tu personaje ficticio favorito")

            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }

    }

    fun generarEvento(): String {


            val lista = listOf("En el pais hay una dictadura", "Alguien consume hongos alucinogenos", "Hay una serie de despidos", "Los animales enloquecen", "Un dia deja de haber consecuencias", "Hay un reencuentro", "Alguien queda mudo/a", "La gente deja de poder dormir", "Por una apuesta casi infantil un personaje toma protagonismo", "Destronan a un rey", "Hay una pandemia", "Se concreta un pacto de sangre", "Hay un apocalipsis", "Hay un intento de suicidio", "Hay un embarazo", "Hay una votación importante", "Hay una ejecucción","Hay un cambio en un planeta de la via lactea", "Los relojes dejan de funcionar")
            val randint = Random.nextInt(lista.size)

            return lista[randint]


    }

    fun generarObjeto(tiempo: Int): String {

        if(intent.getBooleanExtra("RoF", true)) {

            var lista: List<String> = emptyList()

            when(tiempo){

                1 -> lista = listOf("Un vaso", "Una sustancia ilícita", "Una piedra", "Un guante",  "Una dosis de veneno", "Un pañuelo", "Un sobre", "Una arma sin capacidad de matar", "Una pluma", "Una llave capaz de abrir cualquier puerta", "Un perfume",  "Un anillo", "Un mazo de cartas",  "Una bebida espirituoza", "Un reloj roto", "Unas flores", "Un té poco común", "Unos dados")

                2, 3 -> lista = listOf("Una radio", "Un vaso", "Una sustancia ilícita", "Una piedra", "Un guante", "Una camara analogica", "Una dosis de veneno", "Una caja musical", "Un pañuelo", "Una caja de fosforos", "Un cafe", "Un sobre", "Una arma sin capacidad de matar", "Una pluma", "Una llave capaz de abrir cualquier puerta", "Un perfume",  "Un anillo", "Un mazo de cartas", "Un telefono", "Una harmonica", "Una bebida espirituoza", "Un reloj roto", "Unas flores", "Un té poco común", "Unos dados" )

            }

            val randint = Random.nextInt(lista.size)

            return lista[randint]

        }else{
            val lista = listOf("Una radio", "Un vaso", "Una sustancia ilícita", "Una piedra", "Un guante", "Una camara analogica", "Una dosis de veneno", "Una caja musical", "Un pañuelo", "Una caja de fosforos", "Un cafe", "Un sobre", "Una arma sin capacidad de matar", "Una pluma", "Una llave capaz de abrir cualquier puerta", "Un perfume",  "Un anillo", "Un mazo de cartas", "Un telefono", "Una harmonica", "Una bebida espirituoza", "Un reloj roto", "Unas flores", "Un té poco común", "Unos dados")
            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}