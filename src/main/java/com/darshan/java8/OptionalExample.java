package com.darshan.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String args[]) {
        Optional<String> optionalOf = Optional.of(null); //NullPointer
        Optional<String> optionalNullable = Optional.ofNullable(null); // Returns empty if null
        Optional<String> optionalEmty = Optional.empty(); // No value
    }
}
