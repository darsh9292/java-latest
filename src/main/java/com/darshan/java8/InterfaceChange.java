package com.darshan.java8;

public interface InterfaceChange {

    default void helloWorld() {
        System.out.println("hello world from interface change");
    }

    static void sayHello() {
        System.out.println("say hello from interface change");
    }
}
