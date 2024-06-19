package com.example.uitutorial

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uitutorial.databinding.ActivityLearnAlertDialogBinding

class LearnAlertDialog : AppCompatActivity() {

    private lateinit var binding:ActivityLearnAlertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityLearnAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val alertDialogTrigger=binding.btnAlertDialogTrigger
        alertDialogTrigger.setOnClickListener {
            val dialog= AlertDialog.Builder(this)
            dialog.setTitle("Do you want to delete?")
            dialog.setMessage("Are you sure you want to delete this user?")
            dialog.setIcon(com.shashank.sony.fancytoastlib.R.drawable.warning_shape)

            // action buttons
            dialog.setPositiveButton("Yes"){ _,_ ->
                Toast.makeText(this,"Yes clicked", Toast.LENGTH_SHORT).show()
            }
            dialog.setNegativeButton("No"){ _,_ ->
                Toast.makeText(this,"No clicked", Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("Cancel"){ _,_ ->
                Toast.makeText(this,"Cancel clicked", Toast.LENGTH_SHORT).show()
            }

            val alertDialog: AlertDialog =dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}