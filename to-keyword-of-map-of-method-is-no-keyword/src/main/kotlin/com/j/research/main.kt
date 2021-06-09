package com.j.research

fun main() {
    println(10.plus(20))
    println(10 plus 20)
}

infix fun Int.plus(operand: Int) = this + operand