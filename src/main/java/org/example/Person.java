package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String[] hobbies;
// bir class da; birden fazla constructor olmasına constructor overloading olur.
// 1. Constructor
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
// 2. Constructor
    public Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[] hobbies){
        this(firstName, lastName,age); // constructor chaining
        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;

    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
       return this.age >= 13 && this.age <= 19;
    }


}


