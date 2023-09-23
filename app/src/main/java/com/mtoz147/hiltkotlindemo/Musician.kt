package com.mtoz147.hiltkotlindemo

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
//@Singleton //Scope members
@ActivityScoped
class Musician
    @Inject
        constructor(instrument: Instrument,band: Band) {
    fun sing(){
        println("working...")
    }
}