package com.example.string;

public class Example {

    public void harfBul(String kelime, String harf){

        int index = kelime.indexOf(harf);

        if (index== -1){
            System.out.println("Aradığınız harf kelime içinde bulunmamaktadır.");
        }
        while (index != -1){
            System.out.println("Harf \"" + harf + "\" kelime içinde " + (index+1) +". sıradadır.");
            index = kelime.indexOf(harf, index+1);
        }
    }
}


