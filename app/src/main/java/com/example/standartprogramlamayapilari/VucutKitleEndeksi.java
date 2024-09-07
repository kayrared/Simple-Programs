package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String args[])
    {


        int kg, yas;
        double boy;



        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextInt();

        System.out.print("Lütfen boyunuzu giriniz: ");

        boy = input.nextDouble();

        double indeks = kg / (boy * boy);

        String toplam = (indeks - 25 <= 0) ? "İdeal Kilodasınız" : "Obezite";



        System.out.println("Vücut kitle endeksiniz: " + indeks + "-" + toplam);






















    }

}
