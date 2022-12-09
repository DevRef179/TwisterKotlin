package com.example.twisterkotlin.Activitys

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.twisterkotlin.R
import com.example.twisterkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var myPicker = 0
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        Home()


        val values = arrayOf("Two Finger", "Three Finger", "Vour Finger ", "Max Finger")
        binding.nmbrP.minValue = 1
        binding.nmbrP.maxValue  = values.size
        binding.nmbrP.displayedValues = values
        binding.nmbrP.wrapSelectorWheel = true

        binding.button.setOnClickListener {
            if(myPicker <= 0){
                binding.nmbrP2.visibility = View.GONE
                binding.nmbrP.visibility = View.VISIBLE
                binding.button2.visibility = View.GONE
                binding.button3.visibility = View.VISIBLE
                myPicker =0

            }else{
                val intent = Intent(this, OnePlayerActivity::class.java)
                intent.putExtra("Spielmodie",myPicker)
                startActivity(intent)
                finish()
            }
        }
        binding.button2.setOnClickListener {

            if(myPicker <= 0){
                binding.nmbrP2.visibility = View.VISIBLE
                binding.nmbrP.visibility = View.GONE
                binding.button.visibility = View.GONE
                binding.button3.visibility = View.VISIBLE
                myPicker =0

            }else{

                val intent = Intent(this, TwoPlayerActivity::class.java)
                intent.putExtra("Spielmodie",myPicker)
                startActivity(intent)
                finish()
            }

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
                binding.button.setTextColor(Color.parseColor("#FF221606"))
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
                binding.button2.setTextColor(Color.parseColor("#FF221606"))
            }
        }
        binding.button3.setOnClickListener {
            Home()
        }

    }
    fun Home(){
        myPicker =0
        binding.button3.setBackgroundColor(Color.parseColor("#8A624A"))
        binding.nmbrP2.visibility = View.GONE
        binding.nmbrP.visibility = View.GONE
        binding.button.visibility = View.VISIBLE
        binding.button2.visibility = View.VISIBLE
        binding.button3.visibility = View.INVISIBLE
        binding.button.setText("One Player")
        binding.button2.setText("Two Player")
        binding.button.setBackgroundColor(Color.parseColor("#8A624A"))
        binding.button2.setBackgroundColor(Color.parseColor("#8A624A"))
        binding.button.setTextColor(Color.parseColor("#FFFFFFFF"))
        binding.button2.setTextColor(Color.parseColor("#FFFFFFFF"))
    }
}