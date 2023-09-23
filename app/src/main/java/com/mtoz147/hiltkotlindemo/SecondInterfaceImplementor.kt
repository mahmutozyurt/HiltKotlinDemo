package com.mtoz147.hiltkotlindemo

import javax.inject.Inject

class SecondInterfaceImplementor
   @Inject
   constructor():MyInterFace {
    override fun myPrintFunction(): String {
        return "My Second Interface Implement"
    }
}






