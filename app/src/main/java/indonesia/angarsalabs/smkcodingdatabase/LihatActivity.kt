package indonesia.angarsalabs.smkcodingdatabase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lihat.*

class LihatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat)

        // TODO: Siapkan database dan dao nya
        val database = SiswaDatabase.getInstance(this)
        val dao = database?.siswaDAO()

        // TODO: Ambil Datanya dengan memanggit fungsi "Select * from siswa"
        var siswaList = dao?.getAll()

        // TODO: Siapkan recycleviewnya
        val adapter = siswaList?.let { SiswaAdapter(it) }
        rcSiswa.layoutManager  = LinearLayoutManager(this)

        // TODO: Pasang data ke recycleview dan tampilkan
        rcSiswa.adapter = adapter

    }
}
