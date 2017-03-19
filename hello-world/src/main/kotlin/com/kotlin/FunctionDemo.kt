package com.kotlin

/**
 * 函数示例
 *
 * Created by biezhi on 2017/3/19.
 */

/**
 * 带有两个 Int 参数、返回 Int 的函数
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * 将表达式作为函数体、返回值类型自动推断的函数
 */
fun sum2(a: Int, b: Int) = a + b

/**
 * 函数返回无意义的值
 */
fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

fun main(args: Array<String>) {

    print("6 + 10 = ")
    println(sum(6, 10))

    println("19 + 23 = ${sum2(19, 23)}")

    printSum(10, 20)
}