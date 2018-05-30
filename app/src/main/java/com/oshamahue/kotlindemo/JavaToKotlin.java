package com.oshamahue.kotlindemo;

import java.io.IOException;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class JavaToKotlin {

    private KotlinToJava kotlinToJava = new KotlinToJava();


    //region getter setter
    //access kotlin side
    private void getterSetter() {
        String var = kotlinToJava.getKotlinVarString();
        kotlinToJava.setKotlinVarString("New var");
        String val = kotlinToJava.getKotlinValString();
        //kotlinToJava.setKotlinValString("New val");

    }

    private String javaString = "non final string";

    public String getJavaString() {
        return javaString;
    }

    public void setJavaString(String javaString) {
        this.javaString = javaString;
    }

    private final String finalJavaString = "final string";

    public String getFinalJavaString() {
        return finalJavaString;
    }


    //endregion


    //region Null safety

    //call Kotlin nullables
    private void nullables() {
        nullableString = kotlinToJava.getNotNullableString();
        notNullableString = kotlinToJava.getNullableString();
    }

    private String nullableString = null;

    public String getNullableString() {
        return nullableString;
    }


    public void setNullableString(String nullableString) {
        this.nullableString = nullableString;
    }

    private String notNullableString = "bar";

    public String getNotNullableString() {
        return notNullableString;
    }

    public void setNotNullableString(String notNullableString) {
        this.notNullableString = notNullableString;
    }


    //endregion


    //region calling extension functions
    private void callExtensionFunction() {
        KotlinToJavaKt.getThridLetter("foo");
    }
    //endregion


    //region Static access and companion object
    private void staticAccess() {
        String companionVarString = KotlinToJava.Companion.getCompanionString();
        String companionFunString = KotlinToJava.Companion.companionFunction();
    }
    //endregion


    //region accessing package level functions
    private void accessingPackageLevelMembers() {
        String string = KotlinToJavaKt.packageLevelFunction();
        string = KotlinToJavaKt.packageLevelConstant;

    }
    //endregion


    //region Exception throwing and checked exceptions
    private void checkedExceptionsCalls() {
            kotlinToJava.checkedExceptionsThrows();

    }

    void checkedExceptionThrows() throws IOException {
        throw new IOException();
    }
    //endregion


    //region Higher order functions
    public void functionPass() {
        kotlinToJava.functionPass(new Function0<Unit>() {
            @Override
            public Unit invoke() {
                return null;
            }
        });
        Function0<Unit> func = kotlinToJava.functionReturn();
        func.invoke();
    }
    //endregion


    //region accessing members with reserved keywords on the opposite side
    public boolean is() {
        return true;
    }

    private void callExtends(){
        //kotlinToJava.extends()
    }


    //endregion


    //region Var args
    public void javaVarargs(int... args) {
        int myInt = args[1];
        kotlinToJava.kotlinVarargs(1, 2, 3);
    }
    //endregion


}
