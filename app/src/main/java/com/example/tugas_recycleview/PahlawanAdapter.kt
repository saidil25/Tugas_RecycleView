package com.example.tugas_recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PahlawanAdapter(private val context: Context, private val pahlawanList: List<Pahlawan>) :
    RecyclerView.Adapter<PahlawanAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                val pahlawan = pahlawanList[adapterPosition]
                Toast.makeText(context, "YTH: ${pahlawan.nama}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pahlawan, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pahlawan = pahlawanList[position]
        holder.itemView.findViewById<TextView>(R.id.judul).text = pahlawan.nama
        holder.itemView.findViewById<TextView>(R.id.deskripsi).text = pahlawan.deskripsi

        // Set gambar pahlawan ke ImageView berdasarkan nama berkas gambar
        val gambarImageView = holder.itemView.findViewById<ImageView>(R.id.gambar)
        val gambarFileName = pahlawan.gambarFileName
        val resID = context.resources.getIdentifier(gambarFileName, "drawable", context.packageName)
        gambarImageView.setImageResource(resID)
    }

    override fun getItemCount(): Int {
        return pahlawanList.size
    }
}
