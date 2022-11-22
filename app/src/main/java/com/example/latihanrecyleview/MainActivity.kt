package com.example.latihanrecyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciserecyclerview.JobHero

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jobheroList = listOf<JobHero>(
            JobHero(
                R.drawable.warrior,
                "Warior",
                "Warrior adalah class Dragon Nest yang menggunakan senjata jarak dekat seperti sword, hammer, dan axe. Warrior memiliki physical attack yang kuat, kemampuan untuk menghindar yang baik dan dapat melakukan serangan combo yang cepat."
            ),
            JobHero(
                R.drawable.archer,
                "Archer",
                "Sesuai dengan namanya, class Dragon Nest ini menggunakan panah sebagai senjatanya. Archer adalah karakter tergesit di Drgaon Nest. Keunggulan karakter ini adalah serangan jarak jauh dan skill mengindar yang dimilikinya."
            ),
            JobHero(
                R.drawable.sorceress,
                "Sorceress",
                "Sorceress adalah karakter Dragon Nest yang menggunakan tongkat sebagai senjata utamanya, Sorceress memiliki daya serang magic yang tinggi dan dapat bergerak selagi menyerang dengan basic attack."
            ),
            JobHero(
                R.drawable.cleric,
                "Cleric",
                "Cleric menggunakan senjata utama mace atau wand dan menggunakan shield untuk melindungi dirinya dari seragan musuh. Cleric memiliki beberapa keunggulan yaitu, kemampuan untuk menahan serangan musuh, kemampuan heal dan memilki defend yang tinggi."
            ),
            JobHero(
                R.drawable.kali,
                "Kali",
                "Kali adalah karakter yang sangat gesit layaknya seorang akrobat. Kali bertarung jarak dekat dengan mengguunakan senjata cakram atau fans."
            ),
            JobHero(
                R.drawable.tinkerer,
                "Tinkerer",
                "Tinkerer atau yang disebut juga dengan Academic, menggunakan sebuah cannon dan kabala sebagai senjata utamanya. Sehingga membuat Tinkerer unggul dalam pertarungan jarak jauh."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_job)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = JobHeroAdapter(this,jobheroList){

        }
    }
}