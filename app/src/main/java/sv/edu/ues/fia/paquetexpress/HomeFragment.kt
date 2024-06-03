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


        val btnSalir=findViewById<Button>(R.id.btnSalirfh)
        btnSalir.setOnClickListener {
            val intent = Intent(this, Salir::class.java)
            startActivity(intent)
        }

    }




}