package indonesia.angarsalabs.smkcodingdatabase

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.siswa_item.*

// TODO: Buat adapter class untuk recycleview. ingat, beberapa kodingan bisa dilakukan cepat dengan alt + enter
class SiswaAdapter(var list: List<Siswa>): RecyclerView.Adapter<SiswaAdapter.VH>() {
    class VH(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SiswaAdapter.VH {
        return VH(LayoutInflater.from(p0.context).inflate(R.layout.siswa_item, p0, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(p0: SiswaAdapter.VH, p1: Int) {
        val item = list[p1]

        p0.tvNama.setText(item.nama)
        p0.tvAlamat.setText(item.alamat)
        p0.tvNIS.setText(item.nis)
    }
}