package com.kotlin

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by biezhi on 2017/3/19.
 */
class HelloTest {

    @Test
    fun testAssert(): Unit {
        assertEquals("biezhi", getUserName())
    }

}