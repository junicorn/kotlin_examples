package com.kotlin

/**
 * 使用条件表达式
 *
 * Created by biezhi on 2017/3/19.
 */
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    println("0和42进行比较，返回较大的 = ${maxOf(0, 42)}")
}