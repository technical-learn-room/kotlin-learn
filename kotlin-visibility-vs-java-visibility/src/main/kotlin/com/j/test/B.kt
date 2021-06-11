package com.j.test

import com.j.research.A

// 같은 모듈이라도 자신보다 더 좁은 접근 제어 지시자를 가진 클래스를 참조할 수는 없다.
// public > internal >= protected > private

/*
class B {
    val a = A("A")
}
 */

internal class B {
    fun test() {
        val a = A("A")
        a.print()
    }
}