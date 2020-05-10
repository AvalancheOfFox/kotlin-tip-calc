package com.example.kotlintipcalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayTotal.visibility = View.INVISIBLE


        submitButton.setOnClickListener{
            val bill = bill_Input.text.toString().toDouble()
            var tipPercent = desiredGratuityInput.text.toString().toDouble()
            var tip = bill * (tipPercent/100)
            val total = tip + bill
            //interpolate total
            displayTotal.text = "Tip: ${doubleDollarFormatter(tip)} //// Total: ${doubleDollarFormatter(total)}"
            displayTotal.visibility = View.VISIBLE
        }
    }


//        converts double to format $xx.yy
    fun doubleDollarFormatter(inputNum: Double): String {
        return "$" + String.format("%.2f", inputNum)
    }
}
