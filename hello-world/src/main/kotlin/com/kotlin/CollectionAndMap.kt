package com.kotlin

/** 使用集合和Map
 *
 * Created by biezhi on 2017/3/19.
 */

fun main(args: Array<String>) {
    // 对集合进行迭代
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    println("---------------------------")

    // 使用 in 运算符来判断集合内是否包含某实例
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println("---------------------------")

    // 使用 lambda 表达式来过滤（filter）和映射（map）集合
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}