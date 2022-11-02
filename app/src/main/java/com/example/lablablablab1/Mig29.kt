package com.example.test.sanya

import android.util.Log

class 
Mig29(override val length: String = "7m") : Plane(), Fire, LengthPrinter {

    override val speed: Float = 700f

    override fun move() {
        var hours = 1
        for (i in 0..6) {
            hours++
            Log.d(this.javaClass.simpleName, " move: ${speed * hours}")
        }
    }

    override fun fire() {
        Log.d(this.javaClass.simpleName, "fire")
    }
}