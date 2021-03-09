package com.example.calculadorasimples

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaocalcular :Button = btCalcular
        val resultado :TextView  = text_resultado

        btCalcular.setOnClickListener {

            val primeiraNota :Int = Integer.parseInt(nota_1.text.toString())
            val segundaNota :Int = Integer.parseInt(nota_2.text.toString())
            var qtdfaltas  :Int = Integer.parseInt(qtdFalta.text.toString())

            val media = (primeiraNota +segundaNota) /2

            if(media >= 6 && qtdfaltas <= 10){
                text_resultado.setText("Aluno aprovado \n Nota Final: "+media+"\n Faltas: "+qtdfaltas);
                text_resultado.setTextColor(Color.GREEN)
            }else{
                text_resultado.setText("Aluno reprovado \n Nota Final: "+media+"\n Faltas: "+qtdfaltas);
                text_resultado.setTextColor(Color.RED)
            }
        }
    }
}