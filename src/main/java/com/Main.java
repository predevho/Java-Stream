package com;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // v1
        List<Integer> list1 = Arrays
                .stream(new int[]{10, 20, 30})
                .mapToObj(e -> e) // int => Integer
                .toList();

        // v2
        List<Integer> list2 = Arrays
                .stream(new int[]{10, 20, 30})
                .boxed() // int => Integer
                .toList();

        // v3 : 이 경우는 래핑(boxing)할 필요가 없다.
        List<Integer> list3 = Arrays
                .stream(new Integer[]{10, 20, 30})
                .toList();
    }
}