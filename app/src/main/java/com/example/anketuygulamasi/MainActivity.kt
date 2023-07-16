package com.example.anketuygulamasi
import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.anketuygulamasi.ActivityKisiselBilgiler
import com.example.anketuygulamasi.databinding.ActivityMainBinding
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAnket.setOnClickListener {
            val name = binding.nameEditText.text.toString()

            val intent = Intent(this, ActivityKisiselBilgiler::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }


        val onBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START)
                } else {

                }
            }
        }
        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
        }
    }




