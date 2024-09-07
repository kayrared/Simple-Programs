package com.example.standartprogramlamayapilari;
import java.util.Scanner;
public class DaireAlani {

    public static void main(String args[]){

    int r;
    int a;
    double alan, cevre, pi = 3.14, merkezaci;
        Scanner input = new Scanner(System.in);
      System.out.print("Dairenin yarı çapını giriniz:");
        r = input.nextInt();

        System.out.print("Daire dilimi: ");
        a = input.nextInt();

alan = pi * r * r;
cevre = 2 * pi * r;

 merkezaci = (pi * (r*r) * a) / 360;

System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Daire dilimi: " + merkezaci);



    }

}
