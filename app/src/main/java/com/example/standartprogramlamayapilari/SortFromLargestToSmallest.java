package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class SortFromLargestToSmallest {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Birinci Sayıyı giriniz: ");
        int s1 = tarayici.nextInt();

        System.out.println("İkinci Sayıyı giriniz: ");
        int s2 = tarayici.nextInt();

        System.out.println("Üçüncü Sayıyı giriniz: ");
        int s3 = tarayici.nextInt();

        if ((s1 > s2) && (s1 > s3)) {
            if (s2 > s3){
                System.out.println("s1 > s2 > s3");
            } else{
                System.out.println("s1 > s3 >s 2");
            }
        } else if ((s2 > s1) && (s2 >s3)){
           if (s1 > s3){
               System.out.println("s2 > s1 >s 3");
           } else{
               System.out.println("s2 > s3 > s1");
           }
        }
        else {
            if (s1 > s2){
                System.out.println("s3 > s1 >s2");
            } else{
                System.out.println("s3 > s2 > s1");
            }
        }
    }
}
