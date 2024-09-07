
package com.example.standartprogramlamayapilari;
import java.util.Scanner;
public class TaksimetreProgrami {



    public static void main(String args[]) {

      int km, startPrice = 10;
      double perKm = 2.20, total;

    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi KM cinsinden giriniz: ");
    km = input.nextInt();

total = km * perKm;
total += startPrice;

total = (total < 20) ?  20 : total;


        System.out.println("Toplam ücret: " + total);
        System.out.println("Kilometre başı ücret: " + perKm);
        System.out.println("Açılış ücreti: " + startPrice);





    }
}
