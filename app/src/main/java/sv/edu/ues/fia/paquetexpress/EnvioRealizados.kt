package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class EnvioRealizados : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envios_realizados)

        //boton de perfil repartidor
        //Declaración de variables de la vista
        val btnConfirmacion=findViewById<Button>(R.id.btnDetalles)

        // para conocer a que vista se va dirigir el boton
        btnConfirmacion.setOnClickListener {
            val intent = Intent(this, EnvioConfirmados::class.java)
            startActivity(intent)
        }



    }
}