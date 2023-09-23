package com.mtoz147.hiltkotlindemo

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor():MyInterFace{
    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }
}