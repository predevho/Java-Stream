package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice", 20, 'F'));
        people.add(new Person(2, "Bob", 25, 'M'));
        people.add(new Person(3, "David", 35, 'M'));

        // 문제 : 남성들의 나이의 합

        System.out.println("== No Stream ==");
        noStreamVersion(people);

        System.out.println("== Stream ==");
        streamVersion(people);

    }

    static void noStreamVersion(List<Person> people) {
        List<String> names = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender() == 'M') {
                names.add(person.getName());
            }
        }
        System.out.println("남성들의 이름 : " + String.join(", ", names));
    }

    static void streamVersion(List<Person> people) {
        String names = people.stream()
                .filter(p -> p.getGender() == 'M')
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("남성들의 이름 : " + names);
    }

}


class Person {
    private int id;
    private String name;
    private int age;
    private char gender;

    public Person(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}