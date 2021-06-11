package com.j.research;

/*
컴파일 에러
:: 람다식(또는 익명함수)에서 외부 변수를 변경하였기 때문이다.

public class Main {
    public static void main(String[] args) {
        int count = 0;
        TestInterface test = () -> {
            count++;
        };
    }
}
*/

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);

        TestInterface test = () -> count.set(count.get() + 1);
        test.test();
        test.test();

        System.out.println(count);
    }
}