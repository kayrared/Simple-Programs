package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class EBOBveEKOK {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int ebob = 1;

        System.out.print("1. sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int n2 = input.nextInt();



        for (int i = 1; i <= n1; i++){
           if (n1 % i == 0 && n2 % i == 0){

               ebob = i;
           }
       }





       // tersten yazdırma
  for (int j = n1; j >= 1; j--){
  if (n1 % j == 0 && n2 % j == 0){
      ebob = j;
      System.out.println(j);
      break;

  }
 }

        int ekok = (n1 * n2) / ebob;
        System.out.println("---------------");
        System.out.println("EBOB: " + ebob);
        System.out.println("---------------");
        System.out.println("EKOK: " + ekok);
        System.out.println("---------------");





















    }
}
