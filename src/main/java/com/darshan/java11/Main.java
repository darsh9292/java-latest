package com.darshan.java11;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String args[]) {
        System.out.println("No need to compile, now single file can be run");
        System.out.println("java Main.java");

        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        System.out.println(lines);
    }
}
