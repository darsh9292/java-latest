package com.darshan.java17;

public sealed interface IShape permits ICircle, Circle, RandomType {

}

non-sealed interface ICircle extends IShape {

}