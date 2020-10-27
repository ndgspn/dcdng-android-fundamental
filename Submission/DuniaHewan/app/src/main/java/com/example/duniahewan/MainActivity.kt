package com.example.duniahewan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.duniahewan.adapter.ListAnimalAdapter
import com.example.duniahewan.model.Animal
import com.example.duniahewan.model.AnimalsData

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimals: RecyclerView
    private var list: ArrayList<Animal> = arrayListOf()
    private lateinit var listAnimalAdapter: ListAnimalAdapter
    private var title: String = "Dunia Hewan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle("Dunia Hewan")

        rvAnimals = findViewById(R.id.rv_animals)
        rvAnimals.setHasFixedSize(true)

        list.addAll(AnimalsData.listData)
        showRecyclerList()
        setListClickAction()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.manu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.menu_about -> {
                title = "About"
                showAboutAcitiry()
            }
        }
    }

    private fun showAboutAcitiry() {
        val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(aboutIntent)
    }

    private fun showRecyclerList() {
        rvAnimals.layoutManager = LinearLayoutManager(this)
        listAnimalAdapter = ListAnimalAdapter(list)
        rvAnimals.adapter = listAnimalAdapter
    }

    private fun setListClickAction() {
        listAnimalAdapter.setOnItemClickCallback(object : ListAnimalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Animal) {
                val detailIntent = Intent(this@MainActivity, DetailHewanActivity::class.java).apply {
                    putExtra(DetailHewanActivity.EXTRA_NAME, data.name)
                    putExtra(DetailHewanActivity.EXTRA_GRESTATIONPERIOD, data.grestationPeriod)
                    putExtra(DetailHewanActivity.EXTRA_LONGLIFE, data.longOfLife)
                    putExtra(DetailHewanActivity.EXTRA_PHOTO, data.photo)
                    putExtra(DetailHewanActivity.EXTRA_SUMMARY, data.summary)
                    putExtra(DetailHewanActivity.EXTRA_SCIENTIFICNAME, data.scientificN)
                    putExtra(DetailHewanActivity.EXTRA_SPEED, data.speed)
                }

                startActivity(detailIntent)
            }
        })

    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}