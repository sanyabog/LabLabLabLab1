package com.example.test.sanya

import android.util.Log

class AirbusA300(override val length: String = "20m") : Plane(), LengthPrinter {

    override val speed: Float = 500f

    override fun move() {
        var hours = 1
        for (i in 0..5) {
            hours++
            Log.d(this.javaClass.simpleName, " move: ${speed * hours}")
        }
    }
}