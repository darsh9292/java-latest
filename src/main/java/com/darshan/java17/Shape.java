package com.darshan.java17;

public abstract sealed class Shape permits Circle, Reactangle, Square {
    
    //child class has to be final, sealed or non-sealed

    // also same can be applied to interface, see IShape
    
}


