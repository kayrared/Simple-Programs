package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class Zodyak {
    public static void main(String args[]){

        int year;
        String zodyak = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        int kalan = year % 12;


        switch (kalan){
            case 0:

                if (kalan == 0) {
                    System.out.println("Çin Zodyağı Burcunuz: Maymun");
                } break;

            case 1:

                if (kalan == 1) {
                    System.out.println("Çin Zodyağı Burcunuz: Horoz");
                } break;

            case 2:

                if (kalan == 2) {
                    System.out.println("Çin Zodyağı Burcunuz: Köpek");
                } break;

            case 3:

                if (kalan == 3) {
                    System.out.println("Çin Zodyağı Burcunuz: Domuz");
                } break;

            case 4:

                if (kalan == 4) {
                    System.out.println("Çin Zodyağı Burcunuz: Fare");
                } break;


            case 5:

                if (kalan == 5) {
                    System.out.println("Çin Zodyağı Burcunuz: Öküz");
                } break;

            case 6:

                if (kalan == 6) {
                    System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                } break;
            case 7:

                if (kalan == 7) {
                    System.out.println("Çin Zodyağı Burcunuz: Tavşan");
                } break;
            case 8:

                if (kalan == 8) {
                    System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                } break;
            case 9:

                if (kalan == 9) {
                    System.out.println("Çin Zodyağı Burcunuz: Yılan");
                } break;
            case 10:

                if (kalan == 10) {
                    System.out.println("Çin Zodyağı Burcunuz: At");
                } break;
            case 11:

                if (kalan == 11) {
                    System.out.println("Çin Zodyağı Burcunuz: Koyun");
                } break;

            }
    }
}
