package com.example.anketuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.example.anketuygulamasi.databinding.ActivityCustomBinding
import com.example.anketuygulamasi.databinding.ActivityKisiselBilgilerBinding

class ActivityCustom : AppCompatActivity() {

    private lateinit var binding: ActivityCustomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kisiselBilgiler = intent.getParcelableExtra<KisiselBilgiler>("kisiselBilgilerKey")
        val adSoyad = kisiselBilgiler?.adSoyad

        if (adSoyad.isNullOrBlank()) {
            binding.nameTextView.text = "Ad-Soyad Bulunamadı"
        } else {
            binding.nameTextView.text = adSoyad
        }


        binding.anketButton3.setOnClickListener {


            val intent = Intent(this, ActivitySonuclar::class.java)

            startActivity(intent)





        }
    }

}