package com.kotlin

/**
 * 使用字符串模板
 * Created by biezhi on 2017/3/19.
 */
fun main(args: Array<String>) {
    var a = 1
    // simple name in template:
    val s1 = "a = $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, 但是现在 = $a"
    println(s2)
}