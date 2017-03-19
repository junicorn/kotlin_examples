package com.kotlin

/**
 * 使用Kotlin打印 "Hello World"
 *
 * Created by biezhi on 2017/3/19.
 */

/**
 * 定义一个函数，返回值为String类型
 */
fun getUserName(): String {
    return "biezhi"
}

fun main(args: Array<String>) {
    println("Hello Kotlin")
    println(getUserName())
}