@file:JvmName("KotlinToJavaUtil")

package com.oshamahue.kotlindemo

import java.io.IOException


class KotlinToJava {

    private val javaToKotlin = JavaToKotlin()


    //region getter setter
    var kotlinVarString = "Variable"
    val kotlinValString = "Value"

    //access java
    private fun getterSetter() {
        val string = javaToKotlin.javaString
        javaToKotlin.javaString = "New variable"

        val finalString = javaToKotlin.finalJavaString
        //javaToKotlin.finalJavaString ="new final"
    }
    //endregion


    //region Null safety

    var nullableString: String? = null
    var notNullableString: String = "foo"

    private fun nullables() {
        val nullableLength: Int = javaToKotlin.nullableString.length
        val notNullableLength: Int = javaToKotlin.notNullableString.length
    }


    //endregion


    //region call extension functions
    private fun callExtensionFunction() {
        val thridLetter = "foo".getThridLetter()
    }
    //endregion


    //region Static access and companion object
    fun callCompanion() {
        val string = companionString
    }


    companion object {
        @JvmStatic
        val companionString = "companion string"

        @JvmStatic
        fun companionFunction(): String {
            return "companion function"
        }
    }
    //endregion


    //region call package level members
    private fun callPackageLevel() {
        var string = packageLevelFunction()
        string = packageLevelConstant
    }
    //endregion


    //region Exception throwing and checked exceptions
    @Throws(IOException::class)
    fun checkedExceptionsThrows() {
        throw IOException()
    }

    private fun checkedExceptionCalls() {
        javaToKotlin.checkedExceptionThrows()
        checkedExceptionsThrows()
    }
    //endregion


    //region Higher order functions
    fun functionPass(func: () -> Unit) {
        func()//invoking a function
    }

    fun functionReturn(): () -> Unit {
        functionPass(this::nullables)//passing an  existing function
        val func = {}//function creation
        functionPass(func)//passing a function as  variable
        return func
    }
    //endregion


    //region accessing members with reserved keywords on the opposite side
    private fun escapeKeywords() {
        javaToKotlin.`is`()
    }

     @JvmName("isExtends")
    fun extends(): Boolean {
        return false
    }
    //endregion


    //region Var args
    private fun javaVarargs() {
        javaToKotlin.javaVarargs(1, 2, 3, 3, 4, 5, 6)

        val array = intArrayOf(1, 2, 3,5)
        javaToKotlin.javaVarargs(*array)//spread operator

    }

    fun kotlinVarargs(vararg args: Int) {
        val myKotlinInt = args[1]
    }
    //endregion


    //region passing class types
    private fun getJavaClass() {
        val kotlinClass = javaToKotlin::class
        val javaClass = javaToKotlin::class.java
        this.javaClass
    }


    //endregion


}

const val packageLevelConstant = "kotlinToJava"

fun packageLevelFunction(): String {
    return "this is a package level function"
}

fun String.getThridLetter(): Char {
    if (this.length > 2) {
        return this.toCharArray()[2]
    } else throw RuntimeException("Length should be at least 3 ")
}