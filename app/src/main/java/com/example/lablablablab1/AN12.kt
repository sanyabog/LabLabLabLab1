package com.example.test.sanya

import android.util.Log

class AN12: Plane(), LengthPrinter {

    override val speed: Float = 400f

    override val length: String = "25m"

    override fun printLength() {
        super.printLength()
    }

    override fun move() {
        Log.d(javaClass.simpleName, "mode: $speed")
    }
}