package com.example.app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun click() {
//    }
    fun botao(Componente: View) {
        Toast.makeText(this, "boa noite", Toast.LENGTH_SHORT).show()

        val nome = input_nome.text

        val n1 = input_text1.text.toString().toInt()
        val n2 = input_text2.text.toString().toInt()

        val media = (n1 + n2) / 2
        if (media <= 4) {
            text_mgs.text = "Desculpa ${nome}, mas você reprovou"
            text_mgs.setTextColor(Color.BLUE)
        } else {
            text_mgs.text = "Parabéns ${nome}, você passou !"
            text_mgs.setTextColor(Color.RED)
        }
    }
}