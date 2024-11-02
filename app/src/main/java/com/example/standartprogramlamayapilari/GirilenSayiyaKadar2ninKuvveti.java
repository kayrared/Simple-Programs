package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class GirilenSayiyaKadar2ninKuvveti {
    public static void main(String args[]){


        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Sayı Giriniz:");
        n = input.nextInt();

        System.out.println("--------------");
        System.out.println("4'ün kuvvetleri");
for (int i = 1; i <= n; i *=4 ) {
        System.out.println(i);
}
        System.out.println("--------------");
        System.out.println("5'in kuvvetleri");

for (int i = 1; i <= n; i*=5){
        System.out.println(i);
}
        System.out.println("--------------");







    }
}
