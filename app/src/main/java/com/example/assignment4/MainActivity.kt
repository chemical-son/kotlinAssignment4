package com.example.assignment4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    //inflate
    private lateinit var edt: EditText
    private lateinit var txv: TextView
    private lateinit var amazingRB: RadioButton
    private lateinit var goodRB: RadioButton
    private lateinit var okRB: RadioButton
    private lateinit var switch: Switch
    private lateinit var btn: Button
    private lateinit var btnMoveToNextActivity: Button
    private lateinit var btnHappyMeal: Button
    private lateinit var txvTip: TextView

    //local vars
    private var tipAmount: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt = findViewById(R.id.et_v)
        txv = findViewById(R.id.tx_v)
        amazingRB = findViewById(R.id.amazing)
        goodRB = findViewById(R.id.good)
        okRB = findViewById(R.id.ok)
        switch = findViewById(R.id.switch_bt)
        btn = findViewById(R.id.calculate_bt)
        btnMoveToNextActivity = findViewById(R.id.go_to_modifyed_layout)
        btnHappyMeal = findViewById(R.id.go_to_happy_meal)
        txvTip = findViewById(R.id.tx_v_tip)

        btn.setOnClickListener(View.OnClickListener {
            var coast: Double = edt.text.toString().toDouble()

            if(!switch.isChecked){
                when {
                    amazingRB.isChecked -> tipAmount = 1.20
                    goodRB.isChecked -> tipAmount = 1.18
                    okRB.isChecked -> tipAmount = 1.15
                }
            }
            else
                tipAmount = 0.0

            var totalCoast: Double = coast * tipAmount
            txvTip.text = "$tipAmount $"
        })

        btnMoveToNextActivity.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this@MainActivity, MainActivityModified::class.java)
            startActivity(intent)
            finish()
        })
        btnHappyMeal.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this@MainActivity, HappyMealActivity::class.java)
            startActivity(intent)
            finish()
        })

    }
}