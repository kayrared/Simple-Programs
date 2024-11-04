package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class ArmstrongSayilari {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();  // sayı
        int basNumber = 0;  // basamak sayısı
        int tempNumber = number;  // geçici değişken
        int basValue;    // basamak değeri
        int result = 0;  // sonuç
        int total = 0;


        // geçici basamak sayısını işleme almamızın sebebi diğer yapılacak işlemlerde oluşacak hataları önlemektir.


        // basamak sayısı bulma işlemi
        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;

        }

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            int basPow = 1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;

            }
            result += basPow;
            tempNumber /= 10;

        }

        System.out.println("------------");
        if (result == number){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }
        System.out.println("------------");

        while (number > 0){
            total += number % 10;
            number /= 10;
        }
        System.out.println( number +"Basamak sayılarının toplamı: " + total);
















    }
}
