package com.kotlin

/**
 * 使用类型检测及自动类型转换
 *
 * is 运算符检测一个表达式是否某类型的一个实例。
 * 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换
 *
 * Created by biezhi on 2017/3/19.
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        return obj.length
    }
    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    return null
}

fun main(args: Array<String>) {
    fun printLength(obj: Any) {
        println("'$obj' 字符串长度为: ${getStringLength(obj) ?: "... 发生了异常，可能是个假字符串"} ")
    }
    printLength("我是可爱的Kotlin")
    printLength(1000)
    printLength(listOf(Any()))
}
