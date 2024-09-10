package com.example.string;

public class StringMain {
    public static void main(String args[]){
        String s1 = "Hello Asli";
        String s2 = s1;

        String s3= "Hello Asli";
        String s4 = "Hello Asli ";
        String s5 = s4 + "Asli";
        String s6 = new String("Hello Asli");
        if (s1 == s6){
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }

        String s7 = "Hello";
        String s8 = "HELLO";
        if (s7.equals(s8)){
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }

        String s9 = "Hello";
        String s10 = "HELLO";
        if (s9.equalsIgnoreCase(s10)){
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }

        StringBuilder newStringCreator = new StringBuilder();
        newStringCreator.append("Hello");
        newStringCreator.append(" Asli");

        System.out.println(newStringCreator.toString());
    }



}
