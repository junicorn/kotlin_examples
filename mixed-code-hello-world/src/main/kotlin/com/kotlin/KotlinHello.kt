package com.kotlin

import com.javacode.JavaHello

/**
 * Created by biezhi on 2017/3/19.
 */

val KotlinHelloString: String = "Hello from Kotlin!"

fun getHelloStringFromJava(): String {
    return JavaHello.JavaHelloString!!;
}