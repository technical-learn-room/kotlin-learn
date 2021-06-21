package com.j.research

fun main() {
    listOf(1, "1", '1').filterIsInstance<String>().forEach { println(it) }

    test<String>(listOf(1, "2", '3')).forEach { println(it) }
}

inline fun <reified T> test(c: List<*>): List<T> {
    val destination = mutableListOf<T>()
    for (element in c) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}