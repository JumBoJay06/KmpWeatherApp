package com.example.kmpweatherapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform