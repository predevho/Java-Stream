package com;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // 일반
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;

            System.out.println(i);
        }

        // 스트림, 인텔리제이에서 브레이크 포인트 걸어서 Trace Current Stream Chain 뷰를 확인해보세요.
        IntStream.rangeClosed(1, 10)
                .filter(e -> e % 2 != 0)
                .forEach(e -> {
                    System.out.println(e);
                });

    }
}