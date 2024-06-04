package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class EnvioAsignados : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envios_asignados)


     /*   val button=findViewById<Button>(R.id.btnPoliticas1)
        //val button=findViewById<Button>(R.id.btnPreguntas1)

        button.setOnClickListener{
            val intent = Intent(this, Politicas::class.java)
            startActivity(intent)
        }*/

        //boton de envios asignador
        //Declaración de variables de la vista
        val btnrastreo=findViewById<Button>(R.id.btnRastreoEnvio)

        // para conocer a que vista se va dirigir el boton
        btnrastreo.setOnClickListener {
            val intent = Intent(this, EnvioRastreo::class.java)
            startActivity(intent)
        }



    }




}