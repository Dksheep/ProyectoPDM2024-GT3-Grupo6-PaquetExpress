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
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}