package com.example.test.sanya

import android.util.Log

interface LengthPrinter {

    val length: String

    fun printLength() {
        Log.d(javaClass.simpleName, "length is $length")
    }
}