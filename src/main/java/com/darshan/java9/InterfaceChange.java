package com.darshan.java9;

import java.io.*;

public interface InterfaceChange {
    
    private void internalIntefaceMethod() {
        System.out.println("This is new in java 9, earlier they released static and default method in java 8");
    }

    static void testARM_Before_Java9() throws IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
        try (BufferedReader reader2 = reader1) {
          System.out.println(reader2.readLine());
        }
       }

    /**
     * Here, they have improved try with resources
     */
    default void testARM_Java9() throws IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
        try (reader1) {
          System.out.println(reader1.readLine());
        }
    }
}
