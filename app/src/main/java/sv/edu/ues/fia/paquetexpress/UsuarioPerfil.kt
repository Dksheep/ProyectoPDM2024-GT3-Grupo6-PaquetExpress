package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class UsuarioPerfil : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_perfil)

        //boton de historial
        //Declaración de variables de la vista
        val historialPaquet=findViewById<Button>(R.id.btnHistorial)

        // para conocer a que vista se va dirigir el boton
        historialPaquet.setOnClickListener {
            val intent = Intent(this, HistorialPaquetes::class.java)
            startActivity(intent)
        }



    }
}