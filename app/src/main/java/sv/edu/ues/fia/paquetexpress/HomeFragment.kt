package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity


class HomeFragment : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        //boton de seguimiento
        //Declaración de variables de la vista
        val btnSalir=findViewById<Button>(R.id.btnSeguimiento1)

        // para conocer a que vista se va dirigir el boton
        btnSalir.setOnClickListener {
            val intent = Intent(this, DashboardRepartidor::class.java)
            startActivity(intent)
        }


        //boton de ayuda y soporte
        //Declaración de variables de la vista
        val btnayuda=findViewById<Button>(R.id.btnAyuda1)

        // para conocer a que vista se va dirigir el boton
        btnayuda.setOnClickListener {
            val intent = Intent(this, Ayuda::class.java)
            startActivity(intent)
        }


        //boton de mi cuenta
        //Declaración de variables de la vista
        val btncuenta=findViewById<Button>(R.id.btnCuenta1)

        // para conocer a que vista se va dirigir el boton
        btncuenta.setOnClickListener {
            val intent = Intent(this, UsuarioPerfil::class.java)
            startActivity(intent)
        }


        //boton de ENVIO
        //Declaración de variables de la vista
        val btnenvio=findViewById<Button>(R.id.btnEnvios1)

        // para conocer a que vista se va dirigir el boton
        btnenvio.setOnClickListener {
            val intent = Intent(this, EnvioDetalles::class.java)
            startActivity(intent)
        }


        //boton de configuracion
        //Declaración de variables de la vista
        val btnconfiguracion=findViewById<Button>(R.id.btnConfig1)

        // para conocer a que vista se va dirigir el boton
        btnconfiguracion.setOnClickListener {
            val intent = Intent(this, UsuarioCrearModificar::class.java)
            startActivity(intent)
        }


        //boton de administrador
        //Declaración de variables de la vista
        val btnAdministradoo=findViewById<Button>(R.id.btnAdministrador13)

        // para conocer a que vista se va dirigir el boton
        btnAdministradoo.setOnClickListener {
            val intent = Intent(this, MenuAdm::class.java)
            startActivity(intent)
        }


    }


}