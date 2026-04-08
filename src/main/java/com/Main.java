package com;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 비 스트림 ==");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("== 스트림 V1(no lamda) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        new IntConsumer() {
                            @Override
                            public void accept(int value) {
                                System.out.println(value);
                            }
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V2(use lamda) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        (int value) -> {
                            System.out.println(value);
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V3(매개변수 타입 생략) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        (value) -> {
                            System.out.println(value);
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V4(매개변수 괄호 생략) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        value -> {
                            System.out.println(value);
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V5(메서드 바디 중괄호 생략) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(value -> System.out.println(value));
        System.out.println();

        System.out.println("== 스트림 V6(최종축약형) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }
}