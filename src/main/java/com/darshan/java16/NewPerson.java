package com.darshan.java16;

//final class
record Person1(int id, String name) {


}

public class NewPerson {
    public static void main(String[] args) {
        var person = new Person1(1, "Darshan");
        var person1 = new Person1(1, "Darshan");

        System.out.println(person.equals(person1));


        person.toString();
        person.equals(person);
        person.hashCode();
        person.name();
        person.id();
        //person.setId(1); //not provided as it is immutable
    }
}
