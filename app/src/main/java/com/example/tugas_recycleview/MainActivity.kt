package com.example.tugas_recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv_pahlawan)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val pahlawanList = listOf(
            Pahlawan(1, "DR. Mohammad Hatta", "Wakil Presiden Indonesia pertama.", "hatta"),
            Pahlawan(2, "Pangeran Antasari", "Pemimpin perlawanan terhadap penjajah di Kalimantan Selatan.", "antasari"),
            Pahlawan(3, "W.R. Soepratman", "Pencipta lagu kebangsaan Indonesia", "wr"),
            Pahlawan(4, "Tjut Nyak Dhien", "Pahlawan perempuan Aceh yang memimpin perlawanan terhadap penjajah.", "nyak"),
            Pahlawan(5, "R.A. Kartini", "Pahlawan emansipasi perempuan Indonesia.", "ra"),
            Pahlawan(6, "IR. Soekarno", "Presiden pertama Indonesia dan proklamator kemerdekaan.", "ir"),
            Pahlawan(7, "Tuanku Imam Bonjol", "Pemimpin perlawanan terhadap penjajah di Minangkabau.", "bonjol")
        )

        val adapter = PahlawanAdapter(this, pahlawanList)
        recyclerView.adapter = adapter
    }
}
