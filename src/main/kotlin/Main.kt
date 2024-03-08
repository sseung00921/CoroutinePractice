package org.example

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>(CoroutineName("Main")) {
    println("Hello Coroutines")
    println("[${Thread.currentThread().name}] 실행")
    launch(CoroutineName("Coroutine1")) {
        println("[${Thread.currentThread().name}] 실행")
    }
    launch(CoroutineName("Coroutine2")) {
        println("[${Thread.currentThread().name}] 실행")
    }
}