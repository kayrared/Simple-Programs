package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        System.out.print("-----------------------\n");

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println(year + "\nBir artık yıldır.");
                }
                else
                {
                    System.out.println(year + "\nBir artık yıl değildir.");
                }
            }
            else
            {
                System.out.println(year+ "\nBir artık yıldır.");
            }
        }
        else
        {
            System.out.println(year + "\nBir artık yıl değildir.");
        }


    }
}
