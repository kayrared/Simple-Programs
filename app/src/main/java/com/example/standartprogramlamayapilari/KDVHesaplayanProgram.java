package com.example.standartprogramlamayapilari;

import java.util.Scanner;
public class KDVHesaplayanProgram {

    public static void main(String args[]) {

        /*


   Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
   KDV tutarını hesaplayıp ekrana bastıran programı yazın.
   (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;   */

        double tutar, kdvOraniDusuk = 0.08, kdvOraniYuksek = 0.18 , kdvTutar , kdvliTutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen tutarı giriniz: ");

        tutar = inp.nextDouble();


        double kdvOrani = (tutar >= 0 && tutar <= 1000) ? kdvOraniDusuk : kdvOraniYuksek;

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);
        System.out.println("KDV Oranı: " + kdvOrani);














    }
}
