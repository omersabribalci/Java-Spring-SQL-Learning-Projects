package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String city;
    String job;
    String email;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String city, String job, String email) {
        this(firstName, lastName, age);
        this.city = city;
        this.job = job;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }


}
