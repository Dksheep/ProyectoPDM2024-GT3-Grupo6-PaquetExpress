package sv.edu.ues.fia.paquetexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //-Evita que el fondo se vuelva de color oscuro si tienen habilitado el modo noche
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val btnLogin = findViewById<Button>(R.id.btnLogin1)
        val emailField = findViewById<EditText>(R.id.txtMail1)
        val passwordFiel = findViewById<EditText>(R.id.txtClave1)

        //Validacion de los campos de login
        btnLogin.setOnClickListener{
            val email = emailField.text.toString().trim()
            val password = passwordFiel.text.toString().trim()

            if (email.isEmpty()){
                emailField.error = "El correo es obligatorio"
            }else if (password.isEmpty()){
                passwordFiel.error = "La contraseña es obligatoria"
            }else{
                val intent = Intent(this, HomeFragment::class.java)
                startActivity(intent)
            }

        }


        /* val button = findViewById<Button>(R.id.btnLogin1)
        button.setOnClickListener {
            val intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)
        }*/

    }

}