package it.develhope.encapsulation2;
public class Person {
    private String name;
    private String surname;
    private double height;
    private int age;
    public Person(String name, String surname, double height, int age) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
}