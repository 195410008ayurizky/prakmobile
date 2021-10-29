package com.rizkyamalia.ayu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rizkyamalia.ayu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        val inputPinjam = binding.etPinjaman.text.toString().trim()
        val inputTenor = binding.etTenor.text.toString().trim()

            var cair = inputPinjam.toDouble()  - (0.05 * inputPinjam.toDouble())



            var biayaBunga = (inputTenor.toDouble() * 0.0372) * inputPinjam.toDouble()
            var bunga = inputPinjam.toDouble() + biayaBunga



        binding.tvTotalBayar.text = bunga.toString()

        binding.tvDanaCair.text = cair.toString()


    }

}