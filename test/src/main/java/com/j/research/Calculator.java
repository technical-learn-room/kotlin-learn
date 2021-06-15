package com.j.research;

import java.util.List;

public class Calculator {
    public static void pow(List<Integer> numberList) {
        for (int i = 0 ; i < numberList.size() ; i++) {
            numberList.set(i, numberList.get(i) * numberList.get(i));
        }
    }
}
