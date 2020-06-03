package com.example.calculodavelocidade.main

import android.content.Context
import android.graphics.Color
import android.graphics.Color.BLACK
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculodavelocidade.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.text.DecimalFormat


class MainActivity : AppCompatActivity(), MainInterface.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this, this)

        btn_calcular.setOnClickListener {

            var distancia = edt_distancia.text.toString()
            var tempo = edt_tempo.text.toString()
            if (distancia.isEmpty() || distancia == "0" || distancia == "0.0"){
                edt_distancia.error = "erro!"
            }else if (tempo.isEmpty() || tempo == "0" || tempo == "0.0"){
                edt_tempo.error = "erro!"
            }else{
                var setDistancia = distancia.toDouble()
                var setTempo = tempo.toDouble()
                presenter.calcularVelocidade(setDistancia, setTempo)
            }
        }
    }

    /*override fun mensagem(mensagem: String) {
        val snackbar = Snackbar
            .make(activity_main_view, mensagem, Snackbar.LENGTH_LONG)
        snackbar.show()
        snackbar.view.setBackgroundColor(Color.parseColor("#ffffff"))
        snackbar.setActionTextColor(Color.parseColor("#000000"))
    }*/

    override fun mostrarVelocidade(velocidade: Double) {
        val df = DecimalFormat("#.#")
        df.roundingMode = RoundingMode.CEILING
        txt_velocidadeMedia.text =df.format(velocidade)  + "km/h"
    }
}

