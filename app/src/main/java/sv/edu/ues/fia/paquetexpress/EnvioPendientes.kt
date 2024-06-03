package sv.edu.ues.fia.paquetexpress

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class EnvioPendientes : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envios_pendientes)


        /*   val button=findViewById<Button>(R.id.btnPoliticas1)
           //val button=findViewById<Button>(R.id.btnPreguntas1)

           button.setOnClickListener{
               val intent = Intent(this, Politicas::class.java)
               startActivity(intent)
           }*/


    }




}