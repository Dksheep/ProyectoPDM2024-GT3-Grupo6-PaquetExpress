package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MenuAdm: AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_adm)

//      val btnRepartidor=findViewById<Button>(R.id.btnAdmRep1)
//        btnRepartidor.setOnClickListener {
//            val intent = Intent(this, AdminRepartidores::class.java)
//            startActivity(intent)
//        }
        val btnAdmUsuarios=findViewById<Button>(R.id.btnAdmUsuarios1)
        btnAdmUsuarios.setOnClickListener {
            val intent = Intent(this, UsuarioAdm::class.java)
            startActivity(intent)
        }

    }
    fun envioDetalle(view: View){
        val intent= Intent(this, EnvioDetalles::class.java).apply{}
        startActivity(intent)
    }


    fun envioConfir(view: View){
        val intent= Intent(this, EnvioConfirmados::class.java).apply{}
        startActivity(intent)
    }

    fun envioPendiente(view: View){
        val intent= Intent(this, EnvioPendientes::class.java).apply{}
        startActivity(intent)
    }

    fun envioRastreo(view: View){
        val intent= Intent(this, EnvioRastreo::class.java).apply{}
        startActivity(intent)
    }

    fun envioRealizado(view: View){
        val intent= Intent(this, EnvioRealizados::class.java).apply{}
        startActivity(intent)
    }

    fun usuarioAdm(view: View){
        val intent= Intent(this, UsuarioAdm::class.java).apply{}
        startActivity(intent)
    }
    fun envioAsignados(view: View){
        val intent= Intent(this, EnvioAsignados::class.java).apply{}
        startActivity(intent)
    }

    fun historialPaquete(view: View){
        val intent= Intent(this, HistorialPaquetes::class.java).apply{}
        startActivity(intent)
    }


}