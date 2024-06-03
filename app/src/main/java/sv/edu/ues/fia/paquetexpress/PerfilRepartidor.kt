package sv.edu.ues.fia.paquetexpress
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class PerfilRepartidor : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repartidores_perfil)//NOMBRE DE LA ACTIVITY A LA QUE HACE REFERENCIA

    }
}