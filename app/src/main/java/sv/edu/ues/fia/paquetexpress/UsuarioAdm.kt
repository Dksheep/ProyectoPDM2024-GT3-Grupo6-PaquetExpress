package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class UsuarioAdm : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_adm)



        val agregarUsuario = findViewById<Button>(R.id.btnAgregarUsuario1)

        agregarUsuario.setOnClickListener {

            val intent = Intent(this, UsuarioCrearModificar::class.java)

            startActivity(intent)
        }

    }

}