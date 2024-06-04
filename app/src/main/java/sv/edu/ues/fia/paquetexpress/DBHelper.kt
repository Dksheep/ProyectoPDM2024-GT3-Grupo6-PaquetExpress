package sv.edu.ues.fia.paquetexpress

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "PaquetExpress.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_NAME = "Usuarios"
        private const val COLUMN_ID = "usuario_id"
        private const val COLUMN_NAME = "nombre"
        private const val COLUMN_EMAIL = "email"
        private const val COLUMN_PHONE = "telefono"
        private const val COLUMN_ADDRESS = "direccion"
        private const val COLUMN_PASSWORD = "contrasena"
        private const val COLUMN_REGISTRATION_DATE = "fecha_registro"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("""
            CREATE TABLE Usuarios (
                usuario_id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre VARCHAR(100) NOT NULL,
                email VARCHAR(100) UNIQUE NOT NULL,
                telefono VARCHAR(15) NOT NULL,
                direccion VARCHAR(255) NOT NULL,
                contrasena VARCHAR(255) NOT NULL,
                fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            )
        """)

        db?.execSQL("""
            CREATE TABLE Repartidores (
                repartidor_id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre VARCHAR(100) NOT NULL,
                email VARCHAR(100) UNIQUE NOT NULL,
                telefono VARCHAR(15) NOT NULL,
                estado VARCHAR(50) NOT NULL,
                fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            )
        """)
        db?.execSQL("""
            CREATE TABLE Pedidos (
                pedido_id INTEGER PRIMARY KEY AUTOINCREMENT,
                usuario_id INTEGER,
                direccion_recoleccion VARCHAR(255) NOT NULL,
                direccion_destino VARCHAR(255) NOT NULL,
                fecha_preferida DATE NOT NULL,
                tamano_paquete VARCHAR(50) NOT NULL,
                estado_actual VARCHAR(50) NOT NULL,
                fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                FOREIGN KEY (usuario_id) REFERENCES Usuarios(usuario_id)
            )
        """)
        db?.execSQL("""
            CREATE TABLE EstadosEnvio (
                estado_envio_id INTEGER PRIMARY KEY AUTOINCREMENT,
                pedido_id INTEGER,
                repartidor_id INTEGER,
                estado VARCHAR(50) NOT NULL,
                fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                FOREIGN KEY (pedido_id) REFERENCES Pedidos(pedido_id),
                FOREIGN KEY (repartidor_id) REFERENCES Repartidores(repartidor_id)
            )
        """)
        db?.execSQL("""
            CREATE TABLE Pagos (
                pago_id INTEGER PRIMARY KEY AUTOINCREMENT,
                pedido_id INTEGER,
                repartidor_id INTEGER,
                monto DECIMAL(10, 2) NOT NULL,
                fecha_pago TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                FOREIGN KEY (pedido_id) REFERENCES Pedidos(pedido_id),
                FOREIGN KEY (repartidor_id) REFERENCES Repartidores(repartidor_id)
            )
        """)

        db?.execSQL("""
            CREATE TABLE Admin (
                admin_id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre VARCHAR(100) NOT NULL,
                email VARCHAR(100) UNIQUE NOT NULL,
                contrasena VARCHAR(255) NOT NULL
            )
        """)

        db?.execSQL("""
            CREATE TABLE Rutas (
                ruta_id INTEGER PRIMARY KEY AUTOINCREMENT,
                repartidor_id INTEGER,
                pedido_id INTEGER,
                ruta TEXT NOT NULL,
                fecha_programada DATE NOT NULL,
                fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                FOREIGN KEY (repartidor_id) REFERENCES Repartidores(repartidor_id),
                FOREIGN KEY (pedido_id) REFERENCES Pedidos(pedido_id)
            )
        """)
    }


    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS Usuarios")
        db?.execSQL("DROP TABLE IF EXISTS Repartidores")
        db?.execSQL("DROP TABLE IF EXISTS Pedidos")
        db?.execSQL("DROP TABLE IF EXISTS EstadosEnvio")
        db?.execSQL("DROP TABLE IF EXISTS Pagos")
        db?.execSQL("DROP TABLE IF EXISTS Admin")
        db?.execSQL("DROP TABLE IF EXISTS Rutas")
        onCreate(db)
    }
}