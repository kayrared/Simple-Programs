package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class Skyscanner {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

      int mesafe;
      double indirimOrani = 0.10;
     double indirimliTutar;



        System.out.println("Mesafeyi KM türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz(1) => Tek Yön , (2) => Çift Yön): ");
        int yon = input.nextInt();


        double normalTutar = mesafe * 0.10;
        double yasİndirimi = normalTutar * indirimOrani;
        indirimliTutar = normalTutar - yasİndirimi;
        double ciftYonİndirimi = indirimliTutar * 0.20;


if (mesafe < 0){
    System.out.println("Hatalı veri girdiniz.");
}

if (yas < 0){
    System.out.println("Hatalı veri girdiniz.");

if (yas < 12){
    indirimOrani = 0.50;
} else if (yas > 12 && yas < 24) {
    indirimOrani = 0.10;
} else if (yas > 65) {
    indirimOrani = 0.30;
}
}
        switch (yon){
       case 1:
           if (yon == 1){
               System.out.println("Tek Yön");

               System.out.println("Toplam tutar: " + indirimliTutar);
           }else {
               System.out.println("Hatalı veri girdiniz.");
           }
           break;
       case 2:

           if (yon == 2){
               System.out.println("Çift Yön");

               System.out.println("Toplam tutar: " + indirimliTutar);
           }
           break;
       default: System.out.println("Hatalı veri girdiniz.");
   }



















    }
}
