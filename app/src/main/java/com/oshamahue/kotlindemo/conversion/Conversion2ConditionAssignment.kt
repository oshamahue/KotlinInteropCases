package com.oshamahue.kotlindemo.conversion

import java.io.FileReader
import java.io.IOException

class Conversion2ConditionAssignment {

    @Throws(IOException::class)
    internal fun whileAssignment(fr: FileReader) {
        var i: Int =fr.read()
        while (i != -1) {
            print(i.toChar())
            i = fr.read()
        }

    }

}

