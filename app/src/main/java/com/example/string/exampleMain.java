package com.example.string;

import java.util.Scanner;

public class exampleMain {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String nameOfTheMother[] = new String[]{"Ayşe"};
        System.out.print("Bir rakam giriniz : ");
        int num = scanner.nextInt();
        for (int i=0; i< nameOfTheMother.length;i++){
            System.out.println(nameOfTheMother[i]);
            if (num == i){
                System.out.println(nameOfTheMother[i]);
                break;
            }

        }

    }
}
