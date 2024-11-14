package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);


        System.out.print("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();


        System.out.print("1. Sayıyı giriniz: ");
        int sayi = input.nextInt();



        int enBuyukSayi = sayi;
        int enKucukSayi = sayi;

        for (int i = 2; i <= n; i++ ){
            System.out.print( + i + ". sayıyı giriniz: ");
            sayi = input.nextInt();
        } if (sayi > enBuyukSayi){
            enBuyukSayi = sayi;
        } if (sayi < enKucukSayi){
            enKucukSayi = sayi;
        }
        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En küçük sayı: " + enKucukSayi);




       }
    }

