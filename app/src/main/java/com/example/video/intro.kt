package com.example.video

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.video.databinding.ActivityIntroBinding

class intro : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        binding.irparatelamain.setOnClickListener {
            val intent = Intent(this,segundatela::class.java)
            startActivity(intent)
            finish()
        }

        binding.irparatelaregistrar.setOnClickListener {
            val intent = Intent(this, telaregistro::class.java)
            startActivity(intent)
            finish()
        }
    }
}