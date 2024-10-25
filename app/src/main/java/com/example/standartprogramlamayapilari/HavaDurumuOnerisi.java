package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class HavaDurumuOnerisi {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);
        System.out.print("Sıcaklık bilgisini giriniz: ");
        int derece = tarayici.nextInt();

        if (derece < 5){
            System.out.println("Kayak yapmanızı öneririz.");
        }  else if (derece >=  5 && derece <= 25 ){
          if (derece <= 15){
              System.out.println("Sinemaya gitmenizi öneririz.");
          }
          if (derece >= 10){
              System.out.println("Piknik yapmanızı öneririz.");
          }
        }
         else{
            System.out.println("Yüzme havuzuna gitmenizi öneririz.");
        }
    }
}
