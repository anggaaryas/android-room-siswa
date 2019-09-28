package indonesia.angarsalabs.smkcodingdatabase

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

//TODO: Jangan lupa tambahkan @database
@Database(entities = arrayOf(Siswa::class), version = 1)
abstract class SiswaDatabase: RoomDatabase() {
    abstract  fun siswaDAO(): SiswaDAO
    companion object{
        private var INSTANCE: SiswaDatabase? = null
        fun getInstance(context: Context): SiswaDatabase?{
            if (INSTANCE == null){
                synchronized(SiswaDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context
                        , SiswaDatabase::class.java
                        , "siswa-db"
                    ).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }
    }
}