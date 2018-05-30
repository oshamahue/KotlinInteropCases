package com.oshamahue.kotlindemo.otherpackage

import com.oshamahue.kotlindemo.packageLevelConstant
import com.oshamahue.kotlindemo.packageLevelFunction

fun otherPackageLevelFunction() {
    var string = packageLevelFunction()
    string = packageLevelConstant
}