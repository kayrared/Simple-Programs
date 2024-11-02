package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class UsluSayiHesaplamaFor {
    public static void main(String args[]){

        int n,k;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        n = input.nextInt();

        System.out.println("Üssü giriniz: ");
        k = input.nextInt();


        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Sonuç: " + total);
    }
}
