package com.kotlin

/**
 * 循环
 *
 * Created by biezhi on 2017/3/19.
 */
fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    println("---------------------------")

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println("---------------------------")

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

}