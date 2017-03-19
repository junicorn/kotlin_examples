package com.kotlin

/**
 * 局部变量示例
 *
 * Created by biezhi on 2017/3/19.
 */

fun main(args: Array<String>) {
    val a: Int = 1  // immediate assignment
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int  // 如果没有初始值类型不能省略
    c = 3       // 明确赋值
    println("a = $a, b = $b, c = $c")

    var x = 5 // 自动推断出 `Int` 类型
    x += 1
    println("x = $x")

}