package com.example.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivityModified : AppCompatActivity() {

    //inflate
    private lateinit var edt: EditText
    private lateinit var txv: TextView
    private lateinit var amazingRB: RadioButton
    private lateinit var goodRB: RadioButton
    private lateinit var okRB: RadioButton
    private lateinit var switch: Switch
    private lateinit var btn: Button
    private lateinit var btnBackToMainActivity: Button
    private lateinit var txvTip: TextView

    //local vars
    private var tipAmount: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_modified)


        edt = findViewById(R.id.et_v_m)
        txv = findViewById(R.id.tx_v_m)
        amazingRB = findViewById(R.id.amazing_m)
        goodRB = findViewById(R.id.good_m)
        okRB = findViewById(R.id.ok_m)
        switch = findViewById(R.id.switch_bt_m)
        btn = findViewById(R.id.calculate_bt_m)
        btnBackToMainActivity = findViewById(R.id.back_to_main_layout)
        txvTip = findViewById(R.id.tx_v_tip_m)

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


        btnBackToMainActivity.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this@MainActivityModified, MainActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}