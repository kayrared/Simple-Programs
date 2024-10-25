package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class SimpleCalculator {

     public  static void main(String args[]){

         Scanner tarayici = new Scanner(System.in);

         System.out.println("Birinci Sayıyı Giriniz: ");
         int s1 = tarayici.nextInt();

         System.out.println("İkinci Sayıyı Giriniz: ");
         int s2 = tarayici.nextInt();

         System.out.println("(1) Toplama\n(2) Çıkarma\n(3) Çarpma\n(4) Bölme");
         int tercih = tarayici.nextInt();

         if (tercih == 1){
             System.out.println("Toplama sonucu: " + (s1 + s2));

         } else if (tercih == 2) {
             System.out.println("Çıkarma sonucu: " + (s1 - s2));

         } else if (tercih == 3) {
             System.out.println("Çarpma sonucu: " + (s1 * s2));

         }  else if (tercih == 4) {
             if (s2 != 0) {
                 System.out.println("Bölme sonucu: " + (s1 / s2));
             } else {
                 System.out.println("Hata");
             }
         } else {
             System.out.println("Lütfen 1'den 4'e kadar olan hesaplamaları seçiniz.");
         }
     }
 }

