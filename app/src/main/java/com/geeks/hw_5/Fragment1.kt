package com.geeks.hw_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.hw_5.databinding.Fragment1Binding

class Fragment1 : Fragment() {
      private lateinit var binding:Fragment1Binding
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = Fragment1Binding.inflate(inflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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