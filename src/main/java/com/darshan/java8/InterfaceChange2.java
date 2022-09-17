package com.darshan.java8;

public interface InterfaceChange2 {

    default void helloWorld() {
        System.out.println("hello world from interface change2");
    }

    static void sayHello() {
        System.out.println("say hello from interface change2");
    }
}
