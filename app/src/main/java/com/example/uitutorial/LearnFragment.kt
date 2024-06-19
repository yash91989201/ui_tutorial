package com.example.uitutorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uitutorial.databinding.ActivityLearnFragmentBinding
import com.example.uitutorial.fragments.BlankFragment2
import com.example.uitutorial.fragments.LearnFragment1

class LearnFragment : AppCompatActivity() {

    private lateinit var binding:ActivityLearnFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding=ActivityLearnFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val fragmentManager=supportFragmentManager
        val tr=fragmentManager.beginTransaction()
        tr.replace(R.id.fl_fragment,LearnFragment1())
        tr.commit()

        binding.btn1.setOnClickListener{
            val fragmentManager=supportFragmentManager
            val tr=fragmentManager.beginTransaction()
            tr.replace(R.id.fl_fragment,LearnFragment1())
            tr.commit()
        }

        binding.btn2.setOnClickListener{
            val fragmentManager=supportFragmentManager
            val tr=fragmentManager.beginTransaction()
            tr.replace(R.id.fl_fragment,BlankFragment2())
            tr.commit()
        }
    }
}