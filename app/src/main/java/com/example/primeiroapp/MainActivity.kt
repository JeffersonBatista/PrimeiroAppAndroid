package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular :Buttons! = calcular
        val resultado :TextView! = resultado

        btCalcular.setOnClickListener {
            val nota1 :int = Integer.parseInt(nota1.text.toString())
            val nota2 :int = Integer.parseInt(nota2.text.toString())
            val media :int = (nota1 + nota2)/2
            val faltas :int = Integer.parseInt(faltas.text.toString())

            if (media >=6 && faltas <=10){
                resultado.setText("Aluno APROVADO" + "\n" + "Média Final = $media" + "\n" + "Faltas = $faltas")
                resultado.setTextColor(color.GREEN)
            }else{
                resultado.setText("Aluno REPROVADO" + "\n" + "Média Final = $media" + "\n" + "Faltas = $faltas")
                resultado.setTextColor(color.RED)
            }
        }
    }
}