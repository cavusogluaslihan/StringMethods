package com.example.string;

import java.util.Scanner;

public class MirrorWritingMain {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word : ");
        String word = scanner.next();
        String lowerCaseWord = word.toLowerCase();
        int length = lowerCaseWord.length();

        char [] array = new char [length];
        for (int i = 0;i<length;i++){
            array[i] = lowerCaseWord.charAt(i);
        }

        for (int i = (length-1);i>=0;i--){
            System.out.print(array[i]);
        }

    }
}
