package com.example.fragmentcommunicationuserkotlin.Model

class User(var ism:String, var familiya:String) {
    override fun toString(): String {
        return "User{" +
                "ism='" + ism + '\'' +
                ", familiya='" + familiya + '\'' +
                '}'
    }


}