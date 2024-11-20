package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin:");
        int n = input.nextInt();
        int mukemmelSayi = 0;

        for (int i = 1; i <= n / 2; i++){
            if (n % i == 0){
                mukemmelSayi += i;

            }

        }
        if (mukemmelSayi == n){
            System.out.println(n + " mukemmel sayidir");
        } else {
            System.out.println(n + " mukemmel sayı değildir.");
        }

    }
}
