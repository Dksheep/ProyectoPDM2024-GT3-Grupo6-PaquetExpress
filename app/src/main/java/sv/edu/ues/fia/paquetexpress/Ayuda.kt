package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
class Ayuda : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)


        val button=findViewById<Button>(R.id.btnPoliticas1)
        //val button=findViewById<Button>(R.id.btnPreguntas1)

        button.setOnClickListener{
            val intent = Intent(this, Politicas::class.java)
            startActivity(intent)
        }


    }

    fun abrirPoliticas(view: View){
        val intent=Intent(this, PreguntasFrecuentes::class.java).apply{}
        startActivity(intent)
    }


}