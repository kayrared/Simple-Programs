package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String args[]){

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100){
            System.out.println("Lütfen geçerli sayı giriniz.");
            System.out.println("Matematik notunuz: ");
            mat = input.nextInt();
        }


        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100){
            System.out.println("Lütfen geçerli sayı giriniz.");
            System.out.println("Fizik notunuz: ");
            fizik = input.nextInt();
        }


        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100){
            System.out.println("Lütfen geçerli sayı giriniz.");
            System.out.println("Türkçe notunuz: ");
            turkce = input.nextInt();
        }


        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100){
            System.out.println("Lütfen geçerli sayı giriniz.");
            System.out.println("Kimya notunuz: ");
            kimya = input.nextInt();
        }


        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100){
            System.out.println("Lütfen geçerli sayı giriniz.");
            System.out.println("Müzik notunuz: ");
            muzik = input.nextInt();
        }

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama  <= 55){
            System.out.println("Sınıfta kaldınız.");
            System.out.println("Ortalamanız: " + ortalama);
        } else{
            System.out.println("Sınıfı geçtiniz. Tebrikler!");
            System.out.println("Ortalamanız: " + ortalama);
        }






    }
}
