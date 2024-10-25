package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class SwitchSimpleCalculator {
    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz.");
        int s1 = tarayici.nextInt();


        System.out.println("İkinci sayıyı giriniz.");
        int s2 = tarayici.nextInt();

        System.out.println("(1) Toplama\n(2) Çıkarma\n(3) Çarpma\n(4) Bölme");
        int hesaplama = tarayici.nextInt();


        switch (hesaplama){
            case 1:
                System.out.println("Toplama Sonucu:" + (s1 + s2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu:" + (s1 - s2));
                break;
            case 3:
                System.out.println("Çarpma Sonucu:" + (s1 * s2));
                break;
            case 4:
                if (s2 != 0){
                    System.out.println("Bölme Sonucu:" + (s1 / s2));
                } else {
                    System.out.println("Hata");
                }
                break;
            default:
                System.out.println("Lütfen belirtilen hesaplamalardan seçiniz.");
                break;
        }







    }
}
