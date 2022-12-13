package com.example.twisterkotlin.Activitys

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.twisterkotlin.Gamer_Class.OnePlayer_Class
import com.example.twisterkotlin.R
import com.example.twisterkotlin.databinding.ActivityOnePlayerBinding
import kotlinx.coroutines.Delay
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.delay
import java.util.*
import java.util.concurrent.TimeUnit

class OnePlayerActivity : AppCompatActivity(), View.OnTouchListener {

    private var counter = 0
    lateinit var binding: ActivityOnePlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_one_player)

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

        startGame()
        initButtons()
        transparentUnderButtons()


    }

    private fun transparentUnderButtons(){
        val buttons = underBtns()
        for (i in 0 until buttons.size) {
            buttons[i].setBackgroundColor(Color.parseColor("#00ffffff"))
        }
    }



    private fun startGame(){
        var rnd = Random()
        var nr = rnd.nextInt(23)+1
        var lst = overBtnsList()
        lst[nr.toInt()].visibility = View.VISIBLE
    }

    @SuppressLint("ClickableViewAccessibility")
    fun initButtons() {
        this.binding.btn1.setOnTouchListener(this)
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

    fun underBtns(): ArrayList<Button>{
        var btns = ArrayList<Button>()
        btns.add(binding.btn01)
        btns.add(binding.btn02)
        btns.add(binding.btn03)
        btns.add(binding.btn04)
        btns.add(binding.btn05)
        btns.add(binding.btn06)
        btns.add(binding.btn07)
        btns.add(binding.btn08)
        btns.add(binding.btn09)
        btns.add(binding.btn010)
        btns.add(binding.btn011)
        btns.add(binding.btn012)
        btns.add(binding.btn013)
        btns.add(binding.btn014)
        btns.add(binding.btn015)
        btns.add(binding.btn016)
        btns.add(binding.btn017)
        btns.add(binding.btn018)
        btns.add(binding.btn019)
        btns.add(binding.btn020)
        btns.add(binding.btn021)
        btns.add(binding.btn022)
        btns.add(binding.btn023)
        btns.add(binding.btn024)

        return btns
    }

    fun alert(){
        var btns = overBtnsList()
        for (i in 0..23){
            btns[i].setBackgroundResource(R.drawable.alert_btns)
        }
    }

    fun overBtnsList():ArrayList<Button>{

        var btns = ArrayList<Button>()
        btns.add(binding.btn1)
        btns.add(binding.btn2)
        btns.add(binding.btn3)
        btns.add(binding.btn4)
        btns.add(binding.btn5)
        btns.add(binding.btn6)
        btns.add(binding.btn7)
        btns.add(binding.btn8)
        btns.add(binding.btn9)
        btns.add(binding.btn10)
        btns.add(binding.btn11)
        btns.add(binding.btn12)
        btns.add(binding.btn13)
        btns.add(binding.btn14)
        btns.add(binding.btn15)
        btns.add(binding.btn16)
        btns.add(binding.btn17)
        btns.add(binding.btn18)
        btns.add(binding.btn19)
        btns.add(binding.btn20)
        btns.add(binding.btn21)
        btns.add(binding.btn22)
        btns.add(binding.btn23)
        btns.add(binding.btn24)
        return btns
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View, event: MotionEvent): Boolean {

        var oneP = OnePlayer_Class()
        var lstButtons = overBtnsList()
        var lst = underBtns()
        var pDownX = 0
        var pDownY = 0
        var pUpX = 0
        var pUpY = 0
        var nr: String = v.tag.toString()
        val action = event.action
        when (action) {

            MotionEvent.ACTION_DOWN -> {
                lst[nr.toInt() - 1].setBackgroundResource(R.drawable.circle_underbutton)
                var nextBtn= oneP.getRandom(nr.toInt())
                lstButtons[nextBtn].visibility = View.VISIBLE

                counter++

                if (counter % 2 == 0) {
                    lst[nr.toInt() - 1].setBackgroundResource(R.drawable.circle_underbutton)
                    //lst[nr.toInt()-1].setBackgroundColor(Color.parseColor("#FFD500F9"))
                } else if (counter % 2 == 1) {

                } else {

                }
            }
            MotionEvent.ACTION_MOVE -> {
                pDownX = event.x.toInt()
                pDownY = event.y.toInt()
                //binding.textView.text = "X: ${pDownX} Y: ${pDownY}"
                if (pDownX <= -80 || pDownX >= 200 || pDownY <= -80 || pDownY >= 200) {
                    alert()
                }
            }
            MotionEvent.ACTION_UP -> {
               nr.toInt()
                //Toast.makeText(this,"BtnNr: Losgelassen ${nr.toInt()}",Toast.LENGTH_SHORT).show()
                lstButtons[nr.toInt()-1].visibility = View.INVISIBLE
                lst[nr.toInt()-1].visibility = View.INVISIBLE
            }
            MotionEvent.ACTION_CANCEL -> {
            }
            else -> {
            }
        }
        return true
    }
}

