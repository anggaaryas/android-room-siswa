package indonesia.angarsalabs.smkcodingdatabase

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



@Parcelize

// TODO: tabel nya Tabel Siswa
@Entity(tableName = "siswa")
data class Siswa(
    @ColumnInfo(name = "nama") var nama: String,
    @ColumnInfo(name = "alamat") var alamat: String,
    @PrimaryKey @ColumnInfo(name = "nis") var nis: String) : Parcelable

//TODO: Membuat column nama, alamat, dan nis pada tabel