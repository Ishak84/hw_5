package com.geeks.hw_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.geeks.hw_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIncrease.setOnClickListener {
            ++counter
            if (binding.tvResult.text.toString()=="10"){
                binding.btnDecrease.visibility = View.VISIBLE
                binding.btnIncrease.visibility = View.GONE
            }
           binding.tvResult.text = counter++.toString()
        }

        binding.btnDecrease.setOnClickListener{
            --counter
            if (binding.tvResult.text.toString() =="0"){

            }


            binding.tvResult.text = counter--.toString()
        }



    }
}