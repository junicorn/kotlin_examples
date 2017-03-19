package com.javacode;

import com.kotlin.KotlinHelloKt;

/**
 * Created by biezhi on 2017/3/19.
 */
public class JavaHello {

    public static String JavaHelloString = "Hello from Java!";

    public static String getHelloStringFromKotlin() {
        return KotlinHelloKt.getKotlinHelloString();
    }

    public static void main(String[] args) {
        System.out.println(getHelloStringFromKotlin());
        System.out.println(KotlinHelloKt.getHelloStringFromJava());
    }

}
