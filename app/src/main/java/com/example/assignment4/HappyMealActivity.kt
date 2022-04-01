package com.example.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.assignment4.R

class HappyMealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hapy_meal)

        findViewById<Button>(R.id.back_to_main_layout_happy).setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this@HappyMealActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        })

    }
}