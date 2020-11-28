package com.nitin.sonarqube;

import java.io.File;
import java.io.IOException;

public class FirstSonarJava {

    public static final String abc="";

    public static String [] Str1 = {"first","second"};


    public static void main(String[] args) {
        String MayBeNull = null;
        System.out.println("Hello SonarQube "+MayBeNull);

//this is bug and loop will never be executed
        for (int i = 10; i < 10; i++) {
            System.out.println("Loop not true even once");
        }

    }



}
