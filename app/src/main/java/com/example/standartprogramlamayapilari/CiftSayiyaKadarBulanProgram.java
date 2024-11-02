package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class CiftSayiyaKadarBulanProgram {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int k = input.nextInt();

        int toplam = 0;
        int sayac = 0;
        double ortalama;



        for (int i = 0; i <= k; i++){

            if (i % 3 == 0 && i % 4 == 0){
             toplam += i;
             sayac++;

            }
        }

            if (sayac > 0){
                ortalama = (double )toplam / sayac;
                System.out.println("Girilen çift sayıların ortalaması: " + ortalama);
            } else {
                System.out.println("Girilen çift" + k + "ortalaması yok.");
            }










    }
}
