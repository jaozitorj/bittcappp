package com.example.video


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.video.databinding.ActivityTelaexerciciosBinding

private lateinit var mBinding: ActivityTelaexerciciosBinding

class telaexercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityTelaexerciciosBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.exercicio1.setOnClickListener {
            val irparalistacards = Intent(this, Main_activity::class.java)
            startActivity(irparalistacards)
            finish()
        }
        mBinding.exercicio2.setOnClickListener {
            val irparacacapalavra = Intent(this, cacapalavra::class.java)
            startActivity(irparacacapalavra)
            finish()
        }
        mBinding.exercicio3.setOnClickListener {
            val irparacolorir = Intent(this, coloringkid::class.java)
            startActivity(irparacolorir)
            finish()
        }
    }
}