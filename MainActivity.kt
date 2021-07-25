package com.example.atv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var informa: TextView
    private lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.informa = findViewById(R.id.InfoAlter)
        this.botao = findViewById(R.id.button)

        this.botao.setOnClickListener{
            this.informa.text = ("Obtem nome do hardware pelo Kernel ou Sistema operacional.")
        }

    }
}
