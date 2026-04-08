package com;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("== No Stream ==");
        noStreamVersion();

        System.out.println("== Stream ==");
        streamVersion();
    }

    private static void noStreamVersion() {
        String[] messages = new String[]{"1번", "2번", "3번"};
        int[] numbers = new int[messages.length];

        for (int i = 0; i < messages.length; i++) {
            String message = messages[i];
            // message 에서 가장 마지막 한자를 제거
            message = message.substring(0, message.length() - 1);
            int number = Integer.parseInt(message);

            if (number % 2 == 0) continue;

            numbers[i] = number;
        }

        System.out.println("= 결과 =");
        System.out.println(Arrays.toString(numbers));
    }

    private static void streamVersion() {
        int[] array = Arrays.stream(new String[]{"1번", "2번", "3번"})
                .map(e -> e.substring(0, e.length() - 1))
                .mapToInt(Integer::parseInt)
                .filter(number -> number % 2 != 0)
                .toArray();

        System.out.println("= 결과 =");
        System.out.println(Arrays.toString(array));
    }
}