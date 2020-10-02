package com.example.myintentapp

import android.app.Person
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import androidx.annotation.RequiresApi
import org.w3c.dom.Text

class MoveWithObjectActivity : AppCompatActivity() {
    private lateinit var tvObjectReceived: TextView

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        tvObjectReceived = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra<Parcelable>(EXTRA_PERSON) as com.example.myintentapp.Person
        val result = """
            Name: ${person.name}
            Age: ${person.age}
            Email: ${person.email}
            City: ${person.city}
        """.trimIndent()

        tvObjectReceived.text = result
    }
}