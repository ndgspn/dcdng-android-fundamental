package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithDataActivity: Button
    private lateinit var btnMoveWithObject: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data)
        btnMoveWithObject = findViewById(R.id.btn_move_activity_object)

        btnMoveActivity.setOnClickListener(this)
        btnMoveWithDataActivity.setOnClickListener(this)
        btnMoveWithObject.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val intent: Intent = Intent(this@MainActivity, MoveWithDataActivity::class.java).apply {
                    putExtra(MoveWithDataActivity.EXTRA_NAME, "Nandang Sopyan")
                    putExtra(MoveWithDataActivity.EXTRA_AGE, 28)
                }
                startActivity(intent)
            }

            R.id.btn_move_activity_object -> {
                val person = Person(
                    "Nandang Sopyan",
                    28,
                    "nandangsopyan08@gmail.com",
                    "Bogor"
                )

                val intentObject: Intent = Intent(this@MainActivity, MoveWithObjectActivity::class.java).apply {
                    putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                }

                startActivity(intentObject)
            }
        }
    }
}