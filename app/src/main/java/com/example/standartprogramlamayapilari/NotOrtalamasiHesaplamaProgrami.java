package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class NotOrtalamasiHesaplamaProgrami {


    public static void main(String args[]){

        /*
          NOT ORTALAMASI HESAPLAYAN PROGRAM
       Java ile matematik, fizik, kimya, türkçe, tarih, müzik derslerinin
       sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp bastırılan programı yazın
         */

        // Değişkenleri oluştur

        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcı değerlerini al

        System.out.println("Matematik Notunuz: ");

        mat = inp.nextInt();

        System.out.println("Fizik Notunuz: ");

        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz: ");

        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz: ");

        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz: ");

        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz: ");

        muzik = inp.nextInt();


        int toplam = mat + fizik + kimya + turkce + tarih + muzik;

        double sonuc = toplam / 6.0;

        String ortalama = (sonuc - 60 >= 0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";



        System.out.println(ortalama);







    }
}
