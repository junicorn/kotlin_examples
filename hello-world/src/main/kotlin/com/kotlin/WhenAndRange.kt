package com.kotlin

/**
 * 使用 when 表达式和区间(Range)
 *
 * Created by biezhi on 2017/3/19.
 */
fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

fun main(args: Array<String>) {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("---------------------------")

    // 使用 in 运算符来检测某个数字是否在指定区间内
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    println("---------------------------")

    //检测某个数字是否在指定区间外
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    println("---------------------------")

    // 区间内迭代
    for (x in 1..5) {
        print(x)
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

}
