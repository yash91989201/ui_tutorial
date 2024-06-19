package com.example.uitutorial

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uitutorial.databinding.ActivityToastBinding
import com.shashank.sony.fancytoastlib.FancyToast

class Toast : AppCompatActivity() {
    private lateinit var binding:ActivityToastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityToastBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val defaultBtn=binding.btnDefault
        defaultBtn.setOnClickListener{
            Toast.makeText(this, "Action completed ✔",Toast.LENGTH_SHORT).show()
        }

        val fancyBtn=binding.btnFancy
        fancyBtn.setOnClickListener{
            FancyToast.makeText(this, "Fancy Toast",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,false).show()
        }
    }
}