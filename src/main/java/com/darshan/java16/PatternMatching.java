package com.darshan.java16;

public class PatternMatching {
    public static void main(String[] args) {
        //before

        Object obj = "";

        if(obj instanceof String) {
            String s = (String) obj;
            //use s
        }

        //after 

        if (obj instanceof String s) {
            //use s
        }
    }
}
