package com.j.research

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    Calculator.pow(numberList)
    numberList.forEach { println(it) }
}