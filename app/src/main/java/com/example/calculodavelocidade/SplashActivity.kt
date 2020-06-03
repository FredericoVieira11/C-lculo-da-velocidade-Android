package com.example.calculodavelocidade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.calculodavelocidade.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*
import java.lang.Exception

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var handler = Handler()
        handler.postDelayed(Runnable {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)

    }
}
