package com.example.pluanggit.di

import com.example.pluanggit.data.Networking
import com.example.pluanggit.data.PluangNetworkService
import org.koin.dsl.module

val Koinmodule
    get() = module {

        fun providePluangNetworkService(): PluangNetworkService =
            Networking.createPluangNetworkService()

        single { providePluangNetworkService() }


    }