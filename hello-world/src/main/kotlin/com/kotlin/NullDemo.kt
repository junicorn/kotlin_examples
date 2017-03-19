package com.kotlin

/**
 * 使用可空值及 null 检测
 *
 * 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
 * Created by biezhi on 2017/3/19.
 */

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // 直接使用 `x * y` 可能会报错，因为他们可能为 null
    if (x != null && y != null) {
        // 在空检测后，x 和 y 会自动转换为非空值（non-nullable）
        println(x * y)
    } else {
        println("数据 '$arg1' 或者 '$arg2' 不是一个数字")
    }
}


fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // ...
    if (x == null) {
        println("格式化arg1错误: '${arg1}'")
        return
    }
    if (y == null) {
        println("格式化arg2错误: '${arg2}'")
        return
    }

    // 在空检测后，x 和 y 会自动转换为非空值
    println(x * y)
}


fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    println("------------------------")

    printProduct2("6", "7")
    printProduct2("a", "7")
    printProduct2("1", "b")
}
