package indonesia.angarsalabs.smkcodingdatabase

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface SiswaDAO {
    @Query("Select * from siswa")
    fun getAll(): List<Siswa>

    @Query("Select * from siswa where nis = :nis")
    fun getSiswa(nis: String): List<Siswa>

    @Insert
    fun insert(siswa: Siswa)

}