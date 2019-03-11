package com.dumbledank.konan.tensorflow.hello

import kotlinx.cinterop.toKString
import tensorflow.TF_Version

fun main() {
    println("Hello, TensorFlow ${TF_Version()!!.toKString()}!")
}
