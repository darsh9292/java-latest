package com.darshan.java14;

public class NullPointer {

    private int i;

    public static void main(String[] args) {
        
        NullPointer n = new NullPointer();
        NullPointer none = null;
        if (n.i == none.i) {
            System.out.println("Matched");
        }








        //Better error message : 

        // Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "none" is null
        // at com.darshan.java14.NullPointer.main(NullPointer.java:11)

        // Previously just a line number
    }
}
