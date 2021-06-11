package com.j.research

fun main() {
    var count = 0

    val test = TestInterface {
        count++
    }
    test.test()
    test.test()

    println(count)
}