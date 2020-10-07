package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithDataActivity: Button
    private lateinit var btnMoveWithObject: Button
    private lateinit var btnDialNumber: Button
    private lateinit var btnMoveForResult: Button
    private lateinit var tvResult: TextView

    companion object {
        private const val REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.tv_result)
        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data)
        btnMoveWithObject = findViewById(R.id.btn_move_activity_object)
        btnDialNumber = findViewById(R.id.btn_dial_number)
        btnMoveForResult = findViewById(R.id.btn_move_for_result)

        btnMoveActivity.setOnClickListener(this)
        btnMoveWithDataActivity.setOnClickListener(this)
        btnMoveWithObject.setOnClickListener(this)
        btnDialNumber.setOnClickListener(this)
        btnMoveForResult.setOnClickListener(this)

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

            R.id.btn_dial_number -> {
                val phoneNumber = "085777222926"
                val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNumber"))
                startActivity(intentDial)
            }

            R.id.btn_move_for_result -> {
                val moveForResultIntent = Intent(this@MainActivity, MoveForResultActivity::class.java)
                startActivityForResult(moveForResultIntent, REQUEST_CODE)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE) {
            if (resultCode == MoveForResultActivity.RESULT_CODE) {
                val selectedValue = data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)
                tvResult.text = "Hasil: $selectedValue"
            }
            Log.d("request code: ", "$requestCode")
            Log.d("result code: ", "$resultCode")
            Log.d("data: ", "${data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)}")
        }
    }
}