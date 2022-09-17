package com.darshan.java9;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {
    public static void main(String args[]) {
        
        // before
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set = Collections.unmodifiableSet(set);

        // after
        Set<String> col = Set.of("a", "b", "c");
    }
}
