package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class CiftVeDordunKatlari {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int n;
        int sayi = 0;
        int sayac = 0;


        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
               sayi += n;
               sayac++;

            }
        } while (n % 2 == 0);

        System.out.println("Toplam: " + sayi);
    }
}
