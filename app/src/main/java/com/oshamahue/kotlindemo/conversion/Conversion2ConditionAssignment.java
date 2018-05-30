package com.oshamahue.kotlindemo.conversion;

import java.io.FileReader;
import java.io.IOException;

public class Conversion2ConditionAssignment {

    void whileAssignment(FileReader fr) throws IOException {
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

    }

}

