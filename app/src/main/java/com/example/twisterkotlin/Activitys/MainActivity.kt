package com.example.twisterkotlin.Activitys

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.twisterkotlin.R
import com.example.twisterkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        Home()

        var myPicker = 0
        val values = arrayOf("Two Finger", "Three Finger", "Vour Finger ", "Max Finger")
        binding.nmbrP.minValue = 1
        binding.nmbrP.maxValue  = values.size
        binding.nmbrP.displayedValues = values
        binding.nmbrP.wrapSelectorWheel = true

        binding.button.setOnClickListener {
            binding.nmbrP.visibility = View.VISIBLE
            binding.button2.visibility = View.INVISIBLE
            binding.nmbrP2.visibility = View.INVISIBLE
            binding.button3.visibility = View.VISIBLE
        }
        binding.button2.setOnClickListener {
            binding.nmbrP2.visibility = View.VISIBLE
            binding.nmbrP.visibility = View.GONE
            binding.button.visibility = View.GONE
            binding.button3.visibility = View.VISIBLE

        }

        binding.nmbrP.setOnValueChangedListener{picker, oldVal, newVal ->

            myPicker = picker.value
            if (myPicker > 0) {
                /*
                btn1.text = "Start"

                btn1.setTextColor(Color.parseColor("#FF0D0D0D"))

              */
                binding.button.setBackgroundColor(Color.parseColor("#FFFF9100"))
                binding.button.setText("Start")
            }

        }

        binding.nmbrP2.minValue = 1
        binding.nmbrP2.maxValue  = values.size
        binding.nmbrP2.displayedValues = values
        binding.nmbrP2.wrapSelectorWheel = true

        binding.nmbrP2.setOnValueChangedListener{picker, oldVal, newVal ->

            myPicker = picker.value
            if (myPicker > 0) {
                /*
                btn1.text = "Start"

                btn1.setTextColor(Color.parseColor("#FF0D0D0D"))

              */
                binding.button2.setBackgroundColor(Color.parseColor("#FFFF9100"))
                binding.button2.setText("Start")
            }

        }
        binding.button3.setOnClickListener {
            Home()
        }

    }
    fun Home(){
        binding.nmbrP2.visibility = View.GONE
        binding.nmbrP.visibility = View.GONE
        binding.button.visibility = View.VISIBLE
        binding.button2.visibility = View.VISIBLE
        binding.button3.visibility = View.INVISIBLE
        binding.button.setText("One Player")
        binding.button2.setText("Two Player")
        binding.button.setBackgroundColor(Color.parseColor("#FF2979FF"))
        binding.button2.setBackgroundColor(Color.parseColor("#FF2979FF"))
    }
}