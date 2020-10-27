package com.example.duniahewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_hewan.*
import org.w3c.dom.Text

class DetailHewanActivity : AppCompatActivity() {

    private lateinit var imgAnimalDetail: ImageView
    private lateinit var animalName: TextView
    private lateinit var animalSummary: TextView
    private lateinit var animalInformation: TextView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_SUMMARY = "extra_summary"
        const val EXTRA_SCIENTIFICNAME = "scientific_name"
        const val EXTRA_GRESTATIONPERIOD = "grestation_period"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_SPEED = "extra_speed"
        const val EXTRA_LONGLIFE = "extra_longlife"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hewan)
        setActionBarDetail("Dunia Hewan")

        imgAnimalDetail = findViewById(R.id.img_animal_detail)
        animalName = findViewById(R.id.tv_animal_name)
        animalSummary = findViewById(R.id.tv_animal_summary)
        animalInformation = findViewById(R.id.tv_animal_information)
        showProductDetail()
    }

    private fun showProductDetail() {
        animalName.setText(intent.getStringExtra(EXTRA_NAME))
        animalSummary.setText(intent.getStringExtra(EXTRA_SUMMARY))
        animalInformation.setText(Html.fromHtml(
            """
                <b>Nama ilmiah:</b> ${intent.getStringExtra(EXTRA_SCIENTIFICNAME)}<br>
                <b>Umur:</b> ${intent.getStringExtra(EXTRA_LONGLIFE)} tahun<br>
                <b>Kecepatan:</b> ${intent.getStringExtra(EXTRA_SPEED)} Km per jam<br>
                <b>Periode Grestasi:</b> ${if(intent.getStringExtra(EXTRA_GRESTATIONPERIOD) == "-") {
                "Tidak diketahui"
            } else {
                intent.getStringExtra(EXTRA_GRESTATIONPERIOD) + " hari"
            }
            }
            """.trimIndent()

            )
        )

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_PHOTO, 0))
            .into(img_animal_detail)
    }

    private fun setActionBarDetail(title: String) {
        supportActionBar?.title = title
    }
}