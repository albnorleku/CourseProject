package com.roiacademy.lambdaExpressions;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("Filan", 21);

        GetNamePerson getNamePerson = (person, year) -> p1.getName() + " - " + p1.getAge() + " : " + year;

        GetNamePerson getNamePerson1 = new GetNamePerson() {
            @Override
            public String getNameAndAge(Person person, int year) {
                return person.getName() + " - " + person.getAge() + " : " + year;
            }
        };

        System.out.println(getNamePerson.getNameAndAge(p1, 1999));
        System.out.println(getNamePerson1.getNameAndAge(p1, 1999));
    }
}
