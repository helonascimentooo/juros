package com.example.juros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_resultado)
        setSupportActionBar(findViewById(R.id.toolbar1))
        val montante = findViewById<TextView>(R.id.montantee)
        val valor = findViewById<TextView>(R.id.juros)
        val parcela = findViewById<TextView>(R.id.total)
        val valormont = intent.getDoubleExtra("calcmont",0.0)
        val valortotal = intent?.getDoubleExtra("calcvalor",0.0)
        val valorparcela = intent?.getDoubleExtra("calcparcela",0.0)
        montante.text = valormont.toString()
        valor.text = valortotal.toString()
        parcela.text = valorparcela.toString()
    }
}