package com.example.standartprogramlamayapilari;
import java.util.Scanner;
public class FibonacciSerisi {

    public static void main(String args[]){


        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Dizisi: ");
        int n = input.nextInt();


        while (n <= 0) {
            System.out.println("Lütfen 1 ya da daha yüksek sayı giriniz!  ");
            System.out.print("Fibonacci Dizisi: ");
            n = input.nextInt();

        }
                long a = 0,
                        b = 1;
                System.out.println(a + " + " + b + " = " + (a + b));

                for (int i = 3; i <= n; i++) {

                    long next = a + b;

                    System.out.println(a + " + " + b + " = " + next);
                    a = b;
                    b = next;

                }
                System.out.println("-----------------");
                System.out.print("Dizi başarı ile sıralandı.");




























    }
}
