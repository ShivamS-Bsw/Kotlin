package com.example.kotlin_first

class InnerClass {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}