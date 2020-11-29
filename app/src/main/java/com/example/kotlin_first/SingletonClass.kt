package com.example.kotlin_first

object SingletonClass {

    var name = "Shivam";
    var age = 23;

    fun getDetails():String{
        return "$name $age";
    }
}