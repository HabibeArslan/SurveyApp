package com.example.anketuygulamasi

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.annotation.RequiresApi
import com.example.anketuygulamasi.databinding.ActivityCustomBinding
import com.example.anketuygulamasi.databinding.ActivitySonuclarBinding

class ActivitySonuclar : AppCompatActivity() {

    private lateinit var binding: ActivitySonuclarBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonuclarBinding.inflate(layoutInflater)
        setContentView(binding.root)




        onBackPressedDispatcher.addCallback(this@ActivitySonuclar,
            object : OnBackPressedCallback(true) {
                var count = 0
                override fun handleOnBackPressed() {
                    count++
                    if (count == 2) {
                        val intent = Intent(this@ActivitySonuclar, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(
                            this@ActivitySonuclar, "Ana Sayfaya dönmek için tekrar basınız.",
                            Toast.LENGTH_SHORT
                        ).show()

                    }
                }
            })



        binding.backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    }

