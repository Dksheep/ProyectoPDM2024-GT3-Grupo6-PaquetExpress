package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity

class DashboardRepartidor : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repartidores_dashboard)


        //boton de envios asignador
        //Declaración de variables de la vista
        val btnEnviosAsignado=findViewById<Button>(R.id.button2)

        // para conocer a que vista se va dirigir el boton
        btnEnviosAsignado.setOnClickListener {
            val intent = Intent(this, EnvioAsignados::class.java)
            startActivity(intent)
        }


        //boton de perfil repartidor
        //Declaración de variables de la vista
        val btnPerfill=findViewById<Button>(R.id.button3)

        // para conocer a que vista se va dirigir el boton
        btnPerfill.setOnClickListener {
            val intent = Intent(this, PerfilRepartidor::class.java)
            startActivity(intent)
        }





    }

}