package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Normal sayı girin: ");
        int n = input.nextInt();
        System.out.println("Üssü girin: ");
        int k = input.nextInt();

        int total = 1;
        int i = 1;

        while (i <= k){
            total *= n;
            i++;

        }
        System.out.println("Çıktı: " +total);


    }
}
