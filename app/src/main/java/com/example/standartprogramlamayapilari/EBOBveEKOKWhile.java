package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class EBOBveEKOKWhile {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz: ");
        int n1 = input.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int i = 1;

        while (i <= n1 && i <= n2){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }

        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}
