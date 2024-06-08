package com.capstone.crealthapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_white) // Ganti "ic_back_white" dengan nama gambar ikon tombol kembali berwarna putih yang telah disimpan di folder drawable

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}