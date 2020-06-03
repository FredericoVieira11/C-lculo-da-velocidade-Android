package com.example.calculodavelocidade.main

import android.content.Context

interface MainInterface {

    interface View{
        //fun mensagem(mensagem: String)
        fun mostrarVelocidade(velocidade: Double)
    }

    interface Presenter{
        fun calcularVelocidade(distancia: Double, tempo: Double)
    }
}