package com.example.practise1.koin

import com.example.practise1.utils.Checking
import com.example.practise1.utils.Error
import com.example.practise1.utils.Success
import org.koin.dsl.module

val appModule= module {
    single { Error() }

    single { Success() }

    single { Checking(get(),get()) }
}