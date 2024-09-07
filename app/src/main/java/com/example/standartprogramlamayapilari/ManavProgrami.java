package com.example.standartprogramlamayapilari;
import java.util.Scanner;
public class ManavProgrami {

    public static void main(String args[]){


        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armutKilo = input.nextDouble();


        System.out.print("Elma kaç kilo? : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo ?: ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlıcanKilo = input.nextDouble();

        toplam = (armutKilo* armut)+ (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlıcan * patlıcanKilo);

        System.out.println("Toptam Tutar: " + toplam + " TL");









    }
}
