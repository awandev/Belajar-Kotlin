package com.awandev.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    // fungsi yang pertamakali dieksekusi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_click)
        button.setOnClickListener { Toast.makeText(this, "Assalamu Alaykum", Toast.LENGTH_SHORT).show() }

        val rootLayout = findViewById<LinearLayout>(R.id.root_layout)
        val buttonSnack = findViewById<Button>(R.id.btn_click_snack)
        buttonSnack.setOnClickListener { Snackbar.make(rootLayout, "Ini adalah snackbar", Snackbar.LENGTH_SHORT).show() }

//        untuk fragment
        val frameLayout = findViewById<FrameLayout>(R.id.fl_main)
        supportFragmentManager.beginTransaction().replace(R.id.fl_main, MainFragment()).commit()

    }

//    onPause adalah fungsi yang dipanggil ketika user menekan tombol HOME
    override fun onPause() {
        super.onPause()
    }

//    fungsi resume adalah fungsi yang akan dipanggil ketika user mengclick aplikasi kembali setelah menekan tombol home
    override fun onResume() {
        super.onResume()
    }


//    fungsi onDestroy adalah fungsi yang akan dipanggil ketika user mengklik tombol BACK
    override fun onDestroy() {
        super.onDestroy()
    }
}
