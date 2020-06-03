package com.example.calculodavelocidade.main

import android.content.Context

class MainPresenter(private val view: MainInterface.View,
                    private var context: Context) : MainInterface.Presenter {

    override fun calcularVelocidade(distancia: Double, tempo: Double){

        var distancia2 = distancia
        var tempo2 = tempo

        var velocidadeMedia = (distancia2/tempo2) * 3.6

        /*if (velocidadeMedia > 25.0){
             view.mensagem("Você é rápido!")
        }else{
             view.mensagem("Tem que melhorar!")
        }*/



        view.mostrarVelocidade(velocidadeMedia)
    }
}