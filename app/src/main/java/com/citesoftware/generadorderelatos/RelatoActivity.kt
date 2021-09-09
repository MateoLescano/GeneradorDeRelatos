package com.citesoftware.generadorderelatos

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html
import android.view.View.GONE
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class RelatoActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relato)

        val tiempo = Random.nextInt(1,4)

        if(intent.getBooleanExtra("Momento", false)){

            val text = getString(R.string.Momento)
            findViewById<TextView>(R.id.tvMomentoGenerado).text = Html.fromHtml("<b>$text</b>" + " " + generarMomento(tiempo))
        }else{
            findViewById<TextView>(R.id.tvMomentoGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Ubicacion", false)){
            val text = getString(R.string.Ubicacion)
            findViewById<TextView>(R.id.tvUbicacionGenerado).text = Html.fromHtml("<b>$text</b>" + " " + generarUbicacion(tiempo))
        }else{
            findViewById<TextView>(R.id.tvUbicacionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Personaje", false)){
            val text = getString(R.string.Personaje)
            findViewById<TextView>(R.id.tvPersonajeGenerado).text = Html.fromHtml("<b>$text</b>" + " " + generarPersonaje(tiempo))
        }else{
            findViewById<TextView>(R.id.tvPersonajeGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Evento", false)){
            val text = getString(R.string.Evento)
            findViewById<TextView>(R.id.tvAccionGenerado).text = Html.fromHtml("<b>$text</b>" + " " + generarEvento(tiempo))
        }else{
            findViewById<TextView>(R.id.tvAccionGenerado).visibility = GONE
        }

        if(intent.getBooleanExtra("Objeto", false)){
            val text = getString(R.string.Objeto)
            findViewById<TextView>(R.id.tvObjetoGenerado).text = Html.fromHtml("<b>$text</b>" + " " + generarObjeto(tiempo))
        }else{
            findViewById<TextView>(R.id.tvObjetoGenerado).visibility = GONE
        }


        findViewById<Button>(R.id.btnRedes1).setOnClickListener{
            try {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("twitter://user?screen_name=citesoftware")
                    )
                )
            } catch (e: Exception) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/#!/citesoftware")
                    )
                )
            }
        }

        findViewById<Button>(R.id.btnRedes2).setOnClickListener{

            val uri = Uri.parse("http://instagram.com/_u/citesoftware")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.instagram.android")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/citesoftware/"))
                )
            }

        }

        findViewById<Button>(R.id.btnRedes3).setOnClickListener{

            val uri = Uri.parse("http://vm.tiktok.com/citesoftware")
            val likeIng = Intent(Intent.ACTION_VIEW, uri)

            likeIng.setPackage("com.zhiliaoapp.musically")

            try {
                startActivity(likeIng)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.tiktok.com/@citesoftware?lang=es"))
                )
            }

        }



        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.TuRelato)
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
            val lista = listOf(getString(R.string.momento1),
                getString(R.string.momento2),
                getString(R.string.momento3),
                getString(R.string.momento4),
                getString(R.string.momento6),
                getString(R.string.momento7),
                getString(R.string.momento8),
                getString(R.string.momento9),
                getString(R.string.momento10),
                getString(R.string.momento11),
                getString(R.string.momento12),
                getString(R.string.momento14),
                getString(R.string.momento15),
                getString(R.string.momento16),
                getString(R.string.momento17),
                getString(R.string.momento18),
                getString(R.string.momento19),
                getString(R.string.momento20),
                getString(R.string.momento21),
                getString(R.string.momento22),
                getString(R.string.momento23),
                getString(R.string.momento24),
                getString(R.string.momento25),
                getString(R.string.momento26),
                getString(R.string.momento27),
                getString(R.string.momento28),
                getString(R.string.momento29),
                getString(R.string.momento30),
                getString(R.string.momento31),
                getString(R.string.momento32),
                getString(R.string.momento33),
                getString(R.string.momento34),
                getString(R.string.momento35),
                getString(R.string.momento36),
                getString(R.string.momento37),
                getString(R.string.momento38),
                getString(R.string.momento39),
                getString(R.string.momento40),
                getString(R.string.momento41),
                getString(R.string.momento42),
                getString(R.string.momento43),
                getString(R.string.momento44),
                getString(R.string.momento46),
                getString(R.string.momento47),
                getString(R.string.momento48),
                getString(R.string.momento49),
                getString(R.string.momento50),
                getString(R.string.momento51),
                getString(R.string.momento52),
                getString(R.string.momento53),
                getString(R.string.momento54),
                getString(R.string.momento55),
                getString(R.string.momento56),
                getString(R.string.momento57),
                getString(R.string.momento58),
                getString(R.string.momento59),
                getString(R.string.momento60),
                getString(R.string.momento61),
                getString(R.string.momento62)
            )
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
            val lista = listOf(getString(R.string.ubicacion1),
                getString(R.string.ubicacion2),
                getString(R.string.ubicacion3),
                getString(R.string.ubicacion4),
                getString(R.string.ubicacion5),
                getString(R.string.ubicacion6),
                getString(R.string.ubicacion7),
                getString(R.string.ubicacion8),
                getString(R.string.ubicacion9),
                getString(R.string.ubicacion10),
                getString(R.string.ubicacion11),
                getString(R.string.ubicacion12),
                getString(R.string.ubicacion13),
                getString(R.string.ubicacion14),
                getString(R.string.ubicacion15),
                getString(R.string.ubicacion16),
                getString(R.string.ubicacion17),
                getString(R.string.ubicacion18),
                getString(R.string.ubicacion19),
                getString(R.string.ubicacion20),
                getString(R.string.ubicacion21),
                getString(R.string.ubicacion22),
                getString(R.string.ubicacion23),
                getString(R.string.ubicacion24),
                getString(R.string.ubicacion25),
                getString(R.string.ubicacion26),
                getString(R.string.ubicacion27),
                getString(R.string.ubicacion28),
                getString(R.string.ubicacion29),
                getString(R.string.ubicacion30),
                getString(R.string.ubicacion32),
                getString(R.string.ubicacion33),
                getString(R.string.ubicacion34),
                getString(R.string.ubicacion35),
                getString(R.string.ubicacion36),
                getString(R.string.ubicacion37),
                getString(R.string.ubicacion38),
                getString(R.string.ubicacion39),
                getString(R.string.ubicacion40),
                getString(R.string.ubicacion41),
                getString(R.string.ubicacion42),
                getString(R.string.ubicacion43),
                getString(R.string.ubicacion44),
                getString(R.string.ubicacion45)
            )
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
            val lista = listOf(getString(R.string.personajes1),
                getString(R.string.personajes2),
                getString(R.string.personajes3),
                getString(R.string.personajes4),
                getString(R.string.personajes5),
                getString(R.string.personajes6),
                getString(R.string.personajes7),
                getString(R.string.personajes8),
                getString(R.string.personajes9),
                getString(R.string.personajes10),
                getString(R.string.personajes11),
                getString(R.string.personajes12),
                getString(R.string.personajes13),
                getString(R.string.personajes14),
                getString(R.string.personajes15),
                getString(R.string.personajes16),
                getString(R.string.personajes17),
                getString(R.string.personajes18),
                getString(R.string.personajes19),
                getString(R.string.personajes20),
                getString(R.string.personajes21),
                getString(R.string.personajes22),
                getString(R.string.personajes23),
                getString(R.string.personajes24),
                getString(R.string.personajes25),
                getString(R.string.personajes26),
                getString(R.string.personajes27),
                getString(R.string.personajes28),
                getString(R.string.personajes29),
                getString(R.string.personajes30),
                getString(R.string.personajes31),
                getString(R.string.personajes32),
                getString(R.string.personajes33),
                getString(R.string.personajes34),
                getString(R.string.personajes35))
            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }

    }

    fun generarEvento(tiempo: Int): String {


        if(intent.getBooleanExtra("RoF", true)) {

            var lista: List<String> = emptyList()

            when(tiempo){

                1 -> lista = listOf("Una persona con problemas de memoria","Un niño o niña", "Una persona con depresión", "Un viajero del tiempo", "Una persona con poderes", "Un animal", "Un ilustrador de comics", "Un teniente coronel", "Un o una adolescente", "El o la elegida", "Un par de gemelos", "Una persona con un secreto", "Un o una condenada a muerte", "Un o una prisionera",  "Un o una medica", "Un actor/actriz ", "Una o un detective",  "Un o una deportista ", "Una o un escritor ", "Una persona sin hogar", "Una persona que escapa", "Una persona desesperada", "Un o una psicopata", "Una o un asesino", "Tu personaje historico favorito ", "Tu personaje ficticio favorito")

                2, 3 -> lista = listOf("Una persona con problemas de memoria","Un niño o niña", "Una persona con depresión", "Un viajero del tiempo", "Una persona con poderes", "Un animal", "Un o una adolescente", "El o la elegida", "Un o una espia", "Un astronauta", "Un par de gemelos", "Una persona con un secreto", "Un o una condenada a muerte", "Un o una prisionera", "Un o una programadora",  "Un o una medica", "Un actor/actriz ", "Una o un detective", "Un o una medica", "Un barbero", "Una o un muralista",  "Un o una deportista ", "Una o un escritor ", "Una persona sin hogar", "Una persona que escapa", "Una persona desesperada", "Un o una psicopata", "Una o un asesino", "Tu personaje historico favorito ", "Tu personaje ficticio favorito")

            }

            val randint = Random.nextInt(lista.size)

            return lista[randint]

        }else{
            val lista = listOf(getString(R.string.eventos1),
                getString(R.string.eventos2),
                getString(R.string.eventos3),
                getString(R.string.eventos4),
                getString(R.string.eventos5),
                getString(R.string.eventos6),
                getString(R.string.eventos7),
                getString(R.string.eventos8),
                getString(R.string.eventos9),
                getString(R.string.eventos10),
                getString(R.string.eventos11),
                getString(R.string.eventos12),
                getString(R.string.eventos13),
                getString(R.string.eventos14),
                getString(R.string.eventos15),
                getString(R.string.eventos16),
                getString(R.string.eventos17),
                getString(R.string.eventos18),
                getString(R.string.eventos19),
                getString(R.string.eventos20),
                getString(R.string.eventos21),
                getString(R.string.eventos22),
                getString(R.string.eventos23),
                getString(R.string.eventos24),
                getString(R.string.eventos25),
                getString(R.string.eventos26),
                getString(R.string.eventos27),
                getString(R.string.eventos28),
                getString(R.string.eventos29),
                getString(R.string.eventos30),
                getString(R.string.eventos31))
            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }


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
            val lista = listOf(getString(R.string.objetos1),
                getString(R.string.objetos2),
                getString(R.string.objetos3),
                getString(R.string.objetos4),
                getString(R.string.objetos5),
                getString(R.string.objetos6),
                getString(R.string.objetos7),
                getString(R.string.objetos8),
                getString(R.string.objetos9),
                getString(R.string.objetos10),
                getString(R.string.objetos11),
                getString(R.string.objetos12),
                getString(R.string.objetos13),
                getString(R.string.objetos14),
                getString(R.string.objetos15),
                getString(R.string.objetos16),
                getString(R.string.objetos17),
                getString(R.string.objetos18),
                getString(R.string.objetos19),
                getString(R.string.objetos20),
                getString(R.string.objetos21),
                getString(R.string.objetos22),
                getString(R.string.objetos23),
                getString(R.string.objetos24),
                getString(R.string.objetos25),
                getString(R.string.objetos26),
                getString(R.string.objetos27),
                getString(R.string.objetos28),
                getString(R.string.objetos29),
                getString(R.string.objetos30),
                getString(R.string.objetos31),
                getString(R.string.objetos32),
                getString(R.string.objetos33))
            val randint = Random.nextInt(lista.size)

            return lista[randint]
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}