package com.example.string;

public class StringMethodsMain {
    public static void main(String args[]){
        String s1 = "Hello Asli";
        System.out.println(s1.length());
        System.out.println(s1.charAt(6));
        System.out.println(s1.replace('e','o'));
        System.out.println(s1.substring(3,5));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        String[] dizi = s1.split("l");
        for (String s:dizi) {
            System.out.println(s);
        }
    }
}
