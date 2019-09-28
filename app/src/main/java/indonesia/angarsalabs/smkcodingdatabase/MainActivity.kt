package indonesia.angarsalabs.smkcodingdatabase

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: menyiapkan database nya
        var database = SiswaDatabase.getInstance(this)
        var dao = database?.siswaDAO()

        //TODO: Kode ketika tombol input diketik, tambah data
        btnInput.setOnClickListener {
            var nama = etNama.text.toString()
            var alamat = etAlamat.text.toString()
            var nis = etNIS.text.toString()

            var siswa = Siswa(nama, alamat, nis)
            if (dao != null) {
                dao.insert(siswa)
                Toast.makeText(applicationContext, "Berhasil diinput",
                    Toast.LENGTH_SHORT).show()

                //TODO: Tambahkan ini jika ingin menghapus form nya setelah input
                etNama.setText("")
                etAlamat.setText("")
                etNIS.setText("")

            }
        }

        btnLihat.setOnClickListener {
            startActivity(Intent(applicationContext, LihatActivity::class.java))
        }
    }
}
