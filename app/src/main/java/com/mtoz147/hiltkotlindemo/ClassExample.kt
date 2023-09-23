package com.mtoz147.hiltkotlindemo

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject
constructor(@FirstImplementor private val myInterfaceImplementor: MyInterFace,
            private val gson:Gson,
    @SecondImplementor private val mySecondInterfaceImplementor: MyInterFace){

    fun myFunction():String{
        return "Working:${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction():String{
        return "Working:${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}