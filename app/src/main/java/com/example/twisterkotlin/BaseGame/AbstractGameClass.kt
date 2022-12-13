package com.example.twisterkotlin.BaseGame

import java.util.*
import kotlin.collections.ArrayList

abstract class AbstractGameClass {


    var playerOnePoints: Int = 0
        get() = field
        set(value) { field = value }

    var playerTwoPoints: Int = 0
        get() = field
        set(value) { field = value }

    fun newRand(){

    }



    fun getRandom(fingerTag : Int): Int {
        val list = arrayListOf<Int>()
        var compList = arrayListOf<Int>()
        val random = Random()
        var returnInt = 0;
        val rndExist = random.nextInt(25)
        while (compList.contains(rndExist)) {
            val  rndExists = random.nextInt(25)
            if (compList.contains(rndExists)) {
                compList.removeAll(setOf(rndExists))
            }
        }
        var counter = 0
        while (counter < 5) {
            val rnd = random.nextInt(25)
            if (!list.contains(rnd)) {
                counter++
                list.add(rnd)
            }
        }
        returnInt = list.get(counter - 1)
        compList = list
        list.removeAll(setOf(counter))
        return returnInt
    }

    fun playModelAlgo(btnID: Int, fingerLeange: Int){
       var fingr = ArrayList<Int>(fingerLeange)


    }


    fun fingerMember(fingrID: Int, fingrAnzahl: Int,  fingerRequest: Int): ArrayList<Int>{

        var lstFinger=  ArrayList<Int>(fingrAnzahl)
        lstFinger.add(fingrID)
        return lstFinger
    }




















































    /*
    var pDownX=0
    var pDownY=0
    var pUpX=0
    var pUpY=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*imageView.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {

                return true
            }
        })*/

        imageView.setOnTouchListener { v, event ->
            val action = event.action
            when(action){

                MotionEvent.ACTION_DOWN -> {
                    pDownX= event.x.toInt()
                    pDownY= event.y.toInt()
                }


                MotionEvent.ACTION_MOVE -> { }

                MotionEvent.ACTION_UP -> {
                    pUpX= event.x.toInt()
                    pUpY= event.y.toInt()
                }

                MotionEvent.ACTION_CANCEL -> {

                }

                else ->{

                }
            }
            true
        }




        faBtn2.setOnTouchListener { v, event ->
     var pDownX=0
    var pDownY=0
    var pUpX=0
    var pUpY=0
            var minusMotionX : Int =0;
            var plusMotionX: Int  =0;
            var minusMotionY : Int =0;
            var plusMotionY: Int  =0;
            val action = event.action
            when (action) {
                MotionEvent.ACTION_DOWN -> {
                    txt.text = " Button gedrückt"
                }
                MotionEvent.ACTION_MOVE -> {

                    pDownX = event.x.toInt()
                    pDownY = event.y.toInt()

                    whereMyFingers(pDownX,pDownY,txt,btnThree)

                }
                MotionEvent.ACTION_UP -> {
                }
                MotionEvent.ACTION_CANCEL -> {
                }
                else -> {
                }
            }
            true
        }

     */
/*

    @Override
public boolean onTouchEvent(MotionEvent event){

    int action = event.getActionMasked();

    switch(action) {
        case (MotionEvent.ACTION_DOWN) :
            Log.d(DEBUG_TAG,"Action was DOWN");
            return true;
        case (MotionEvent.ACTION_MOVE) :
            Log.d(DEBUG_TAG,"Action was MOVE");
            return true;
        case (MotionEvent.ACTION_UP) :
            Log.d(DEBUG_TAG,"Action was UP");
            return true;
        case (MotionEvent.ACTION_CANCEL) :
            Log.d(DEBUG_TAG,"Action was CANCEL");
            return true;
        case (MotionEvent.ACTION_OUTSIDE) :
            Log.d(DEBUG_TAG,"Movement occurred outside bounds " +
                    "of current screen element");
            return true;
        default :
            return super.onTouchEvent(event);
    }
}


class rndButton {
    private var size: Int = 24
    private var counter = 0;
    private val list = arrayListOf<Int>()
    private val random = Random()

    fun myRandom(): List<Int> {
        while (counter < 24) {
            val rnd = random.nextInt(25)
            if (list.contains(rnd)) {
                counter++
                list.add(rnd)
            }
        }
        return list
    }
}
        public void listeInButtons() {
        boolean ende = false;
        int counterA = 0;
        int position = 0;
        while (rndList().size() > counterA && ende == false) {

            position = rndList().get(counterA);
            mySwitch(position);
            counterA++;
        }
    }
      fun erstelleRandNr(): Int {
        val list = arrayListOf<Int>()
        var compList = arrayListOf<Int>()
        val random = Random()
        var returnInt = 0;
        val rndExist = random.nextInt(25)


        while (compList.contains(rndExist)) {
            val  rndExists = random.nextInt(25)
            if (compList.contains(rndExists)) {
                compList.removeAll(setOf(rndExists))
            }
        }

        var counter = 0
        while (counter < 5) {
            val rnd = random.nextInt(25)
            if (!list.contains(rnd)) {
                counter++
                list.add(rnd)
            }
        }
        returnInt = list.get(counter - 1)
        compList = list
        list.removeAll(setOf(counter))
        binding.textView.text = list.get(counter - 1).toString()
        return returnInt
    }

     */
}