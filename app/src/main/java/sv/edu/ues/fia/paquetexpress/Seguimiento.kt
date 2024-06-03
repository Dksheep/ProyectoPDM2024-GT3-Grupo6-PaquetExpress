package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity

class Seguimiento: AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repartidores_dashboard)

//
//    val btnSeguimiento=findViewById<Button>(R.id.btnSeguimiento1)
//    btnSeguimiento.setOnClickListener{
//        val intent = Intent(this, DashboardRepartidor::class.java)
//        startActivity(intent)
//      }
    }
 }