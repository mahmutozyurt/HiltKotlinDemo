package com.mtoz147.hiltkotlindemo

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterFace {
    fun myPrintFunction():String
}
/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor):MyInterFace


}*/

@InstallIn(SingletonComponent::class)
@Module
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction():MyInterFace{
        return InterfaceImplementor()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction():MyInterFace{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gSonProvider(): Gson{
        return Gson()
    }
}

//annotation creation
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor