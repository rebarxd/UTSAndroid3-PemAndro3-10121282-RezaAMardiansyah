package com.example.utsandroid_pem_andro_3_10121282_rezaamardiansyah

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class CekKembaliIsianDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViewTestType: TextView = findViewById(R.id.textViewTestType)
        val textViewDateConfirmed: TextView = findViewById(R.id.textViewDateConfirmed)
        val textViewNIK: TextView = findViewById(R.id.textViewNIK)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val textViewDOB: TextView = findViewById(R.id.textViewDOB)
        val textViewGender: TextView = findViewById(R.id.textViewGender)
        val textViewRelationship: TextView = findViewById(R.id.textViewRelationship)

        val testType = intent.getStringExtra("TEST_TYPE")
        val dateConfirmed = intent.getStringExtra("DATE_CONFIRMED")
        val nik = intent.getStringExtra("NIK")
        val name = intent.getStringExtra("NAME")
        val dob = intent.getStringExtra("DOB")
        val gender = intent.getStringExtra("GENDER")
        val relationship = intent.getStringExtra("RELATIONSHIP")

        textViewTestType.text = testType
        textViewDateConfirmed.text = dateConfirmed
        textViewNIK.text = nik
        textViewName.text = name
        textViewDOB.text = dob
        textViewGender.text = gender
        textViewRelationship.text = relationship

        val buttonCheckResults: Button = findViewById(R.id.buttonCheckResults)
        buttonCheckResults.setOnClickListener {
            // Handle check results click
        }

        val buttonEdit: Button = findViewById(R.id.buttonEdit)
        buttonEdit.setOnClickListener {
            finish()
        }

        buttonCheckResults.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, BottomSheetFragment.TAG)
        }
    }
}
