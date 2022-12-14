package com.example.twisterkotlin.BaseGame

import java.util.*
import kotlin.collections.ArrayList

abstract class AbstractGameClass {
    private var counterA = 1
    private var counterNewRandom = 0
    private var rnd = Random()

    private var game = ArrayList<Int>()
        get() = field
        set(value) {
            field = value
        }


    var playerOnePoints: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var playerTwoPoints: Int = 0
        get() = field
        set(value) {
            field = value
        }


    fun newRand(): Int {
        var intNr: Int = rnd.nextInt(23) + 1
        while (game.equals(intNr)) {
            intNr = rnd.nextInt(23) + 1
        }
        return intNr
    }

    fun add(btnID: Int) {
        game.add(btnID)
    }

    fun removeBtn(btnID: Int) {
        //game.remove(btnID)
        game.removeAll(setOf(btnID))
    }

/*
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