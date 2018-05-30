package com.oshamahue.kotlindemo.conversion;

public class Conversion4Statics {


    private static final int MY_INT = 42;
    public static final String MY_STRING = "My string";

    public static int getMyIntStatic() {
        return MY_INT;
    }

    int getMyIntNonStatic() {
        return MY_INT;
    }
}
