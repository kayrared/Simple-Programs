package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class AsalSayiProgrami {

    public static void main(String args[]){


        Scanner input = new Scanner(System.in);

        System.out.print("Asal Sayılar: ");



        for (int i = 2; i <= 100; i++){

           boolean asal = true;

           for (int j = 2; j < i; j++){

               if (i % j == 0){
                   asal = false;
                   break;
               }

           }

           if (asal)
           {
               System.out.print(i + " ");
           }

        }


    }
}
