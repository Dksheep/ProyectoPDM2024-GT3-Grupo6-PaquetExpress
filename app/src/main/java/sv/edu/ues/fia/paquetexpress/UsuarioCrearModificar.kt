package sv.edu.ues.fia.paquetexpress
import android.widget.Button
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class UsuarioCrearModificar : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_crear_modificar)//NOMBRE DE LA ACTIVITY A LA QUE HACE REFERENCIA

    }
}