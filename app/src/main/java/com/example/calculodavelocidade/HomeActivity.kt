package com.example.calculodavelocidade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculodavelocidade.main.MainActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        cardview_sprint.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
/*<Button
            android:id="@+id/btn_sprint"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_row="0"
            android:layout_rowWeight="1"
            android:layout_column="0"
            android:layout_columnWeight="1"
            android:layout_gravity="fill"
            android:layout_margin="10dp"
            android:background="@drawable/custom_button"
            android:text="Sprint"
            android:textColor="#fff"/>

        <Button
            android:id="@+id/button2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_row="0"
            android:layout_rowWeight="1"
            android:layout_column="1"
            android:layout_columnWeight="1"
            android:layout_gravity="fill"
            android:layout_margin="10dp"
            android:background="@drawable/custom_button"
            android:text="Maratona"
            android:textColor="#fff"/>

        <Button
            android:id="@+id/button3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_row="1"
            android:layout_rowWeight="1"
            android:layout_column="0"
            android:layout_columnWeight="1"
            android:layout_gravity="fill"
            android:background="@drawable/custom_button"
            android:layout_margin="10dp"
            android:textColor="#fff"
            android:text="Button"/>

        <Button
            android:id="@+id/button4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_row="1"
            android:layout_rowWeight="1"
            android:layout_column="1"
            android:layout_columnWeight="1"
            android:layout_gravity="fill"
            android:elevation="12dp"
            android:layout_margin="10dp"
            android:background="@drawable/custom_button"
            android:text="Button" />*/