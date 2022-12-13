package com.example.twisterkotlin.Activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.twisterkotlin.R
import com.example.twisterkotlin.databinding.ActivityTwoPlayerBinding
import java.util.*

class TwoPlayerActivity : AppCompatActivity(), View.OnTouchListener {
    lateinit var binding: ActivityTwoPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_two_player)
        val playModus = Integer.parseInt(intent.extras?.get("Spielmodie").toString())

        when (playModus) {
            1 -> {
                Toast.makeText(this,"Two Fingers", Toast.LENGTH_SHORT).show()
            }
            2 -> {
                Toast.makeText(this,"Three Fingers", Toast.LENGTH_SHORT).show()
            }
            3 -> {
                Toast.makeText(this,"Four Fingers", Toast.LENGTH_SHORT).show()
            }
            4 -> {
                Toast.makeText(this,"Max Fingers", Toast.LENGTH_SHORT).show()
            }
            else -> {
                print("x is neither 1 nor 2")
            }
        }
        initB()
        btnVisibility()
    }
    /*

    fun startGame(){
        var rnd = Random()
        var nr = rnd.nextInt(23)+1
        var lst = overBtnsList()
        lst[nr.toInt()].visibility = View.VISIBLE
    }

     */
    fun btnVisibility() {
        binding.btn1.visibility = View.VISIBLE
        binding.btn2.visibility = View.VISIBLE
        binding.btn3.visibility = View.VISIBLE
        binding.btn4.visibility = View.VISIBLE
        binding.btn5.visibility = View.VISIBLE
        binding.btn6.visibility = View.VISIBLE
        binding.btn7.visibility = View.VISIBLE
        binding.btn8.visibility = View.VISIBLE
        binding.btn9.visibility = View.VISIBLE
        binding.btn10.visibility = View.VISIBLE
        binding.btn11.visibility = View.VISIBLE
        binding.btn12.visibility = View.VISIBLE
        binding.btn13.visibility = View.VISIBLE
        binding.btn14.visibility = View.VISIBLE
        binding.btn15.visibility = View.VISIBLE
        binding.btn16.visibility = View.VISIBLE
        binding.btn17.visibility = View.VISIBLE
        binding.btn18.visibility = View.VISIBLE
        binding.btn19.visibility = View.VISIBLE
        binding.btn20.visibility = View.VISIBLE
        binding.btn21.visibility = View.VISIBLE
        binding.btn22.visibility = View.VISIBLE
        binding.btn23.visibility = View.VISIBLE
        binding.btn24.visibility = View.VISIBLE
    }

    @SuppressLint("ClickableViewAccessibility")
    fun initB(){
        this.binding.btn2.setOnTouchListener(this)
        this.binding.btn3.setOnTouchListener(this)
        this.binding.btn4.setOnTouchListener(this)
        this.binding.btn5.setOnTouchListener(this)
        this.binding.btn6.setOnTouchListener(this)
        this.binding.btn7.setOnTouchListener(this)
        this.binding.btn8.setOnTouchListener(this)
        this.binding.btn9.setOnTouchListener(this)
        this.binding.btn10.setOnTouchListener(this)
        this.binding.btn11.setOnTouchListener(this)
        this.binding.btn12.setOnTouchListener(this)
        this.binding.btn13.setOnTouchListener(this)
        this.binding.btn14.setOnTouchListener(this)
        this.binding.btn15.setOnTouchListener(this)
        this.binding.btn16.setOnTouchListener(this)
        this.binding.btn17.setOnTouchListener(this)
        this.binding.btn18.setOnTouchListener(this)
        this.binding.btn19.setOnTouchListener(this)
        this.binding.btn20.setOnTouchListener(this)
        this.binding.btn21.setOnTouchListener(this)
        this.binding.btn22.setOnTouchListener(this)
        this.binding.btn23.setOnTouchListener(this)
        this.binding.btn24.setOnTouchListener(this)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, p1: MotionEvent?): Boolean {
        Toast.makeText(this, "Button Nr:"+"   ${v?.tag}", Toast.LENGTH_SHORT).show()

        when (v?.tag) {
            1 -> {

            }
            2 -> {
                print("x == 2")
            }


            /*
                val action = motionEvent.action
        when (action) {
            MotionEvent.ACTION_DOWN -> {

                Toast.makeText(this, "Runter gedrückt", Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_MOVE -> {
                Toast.makeText(this, "Wurde bewegt", Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_UP -> {

                Toast.makeText(this, "Los gelasse", Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_CANCEL -> {
            }
            else -> {
            }
        }
        return true


        }


        lateinit var binding: ActivityMainBinding
        binding.button.setOnTouchListener(this)
        binding.button2.setOnTouchListener(this)
        binding.button3.setOnTouchListener(this)

        var tag: String = v?.getTag() as String
        var tagtag = tag.toInt()
        when (tagtag) {
            1 -> {
                Log.i("onTouch", "1 Reingelaufen")
            }
            2 -> {
                Log.i("onTouch", "2 Reingelaufen")
            }
            3 -> {
                Log.i("onTouch", "3 Reingelaufen")
            }
        }
        return true
         */


        }
        return true
    }
}