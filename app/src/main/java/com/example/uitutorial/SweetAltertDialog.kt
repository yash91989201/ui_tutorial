package com.example.uitutorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.uitutorial.databinding.ActivitySweetAltertDialogBinding

class SweetAltertDialog : AppCompatActivity() {

    private lateinit var binding:ActivitySweetAltertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivitySweetAltertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1=binding.btnTrigger1
        val btn2=binding.btnTrigger2
        val btn3=binding.btnTrigger3

        btn1.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success")
                .setContentText("Button successfully clicket")
                .show()
        }

        btn2.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.NORMAL_TYPE)
                .setTitleText("Success")
                .setContentText("Button successfully clicket")
                .show()
        }

        btn3.setOnClickListener{
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Success")
                .setContentText("Button successfully clicket")
                .show()
        }
    }
}