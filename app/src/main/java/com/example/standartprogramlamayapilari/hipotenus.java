package com.example.standartprogramlamayapilari;
import java.util.Scanner;
public class hipotenus {

    public static void main(String args[]){

        // degiskenler

        int a, b, c;
        double  cevre;


        // scanner sınıfı

        Scanner girdi = new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        a = girdi.nextInt();

        System.out.print("2. kenarı giriniz: ");
        b = girdi.nextInt();

        System.out.print("3. kenarı giriniz: ");
        c = girdi.nextInt();

       double u = (a+b+c) / 2 ;

       double alanKok = u * (u-a) * (u-b) * (u-c);

       double alan = Math.sqrt(alanKok);



       System.out.print("Üçgenin alanı: " + alan);




    }

}
