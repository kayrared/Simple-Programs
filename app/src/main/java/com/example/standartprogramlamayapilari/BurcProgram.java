package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class BurcProgram {


    public static void main(String args[]){

        int birthday, month;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        System.out.println("Doğduğunuz günü giriniz: ");
        birthday = input.nextInt();




        switch (month){
            case 1:
                if (birthday >= 1 && birthday <= 31 ){

                if (birthday < 22 ){
                   burc = "Oğlak burcu";
                } else {
                    burc = "Kova Burcu";
                }
            } else {
                    isError = true;
                }
                break;


            case 2:
                if (birthday >= 1 && birthday <= 28){
                    if (birthday < 20 ){
                       burc ="Kova Burcu";
                    } else {
                       burc = "Balık Burcu";
                    }
                }else {
                    isError = true;
                }
                break;

            case 3:
                if (birthday >= 1 && birthday <= 31){
                    if (birthday < 21 ){
                       burc = "Balık burcu";
                    } else {
                       burc = "Koç Burcu";
                    }
                }else {
                   isError = true;
                }
                break;

            case 4:
                if (birthday >= 1 && birthday <= 31){
                    if (birthday < 21 ){
                        burc = "Koç burcu";
                    } else {
                      burc =  "Boğa Burcu";
                    }
                }else {
                    isError = true;
                }
                break;

            case 5:
                if (birthday >= 1 && birthday <= 31){
                    if (birthday < 22 ){
                       burc = "Boğa burcu";
                    } else {
                        burc = "İkizler Burcu";
                    }
                }else {
                   isError = true;
                }
                break;

            case 6:
                if (birthday >= 1 && birthday <= 31){
                    if (birthday < 23 ){
                       burc  = "İkizler Burcu";
                    } else {
                       burc =  "Yengeç Burcu";
                    }
                }else {
                   isError = true;
                }
                break;

            case 7:
                if (birthday >= 1 && birthday <= 31){

                    if (birthday < 23 ){
                        burc = "Yengeç Burcu";
                    } else {
                        burc = "Aslan Burcu";
                    }
                }else {
                    isError = true;
                }
                break;

            case 8:
                if (birthday >= 1 && birthday <= 31){
                    if (birthday < 23 ){
                      burc = "Aslan burcu";
                    } else {
                        burc = "Başak Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            case 9:
                if (birthday >= 1 && birthday <= 31){
                    if (birthday < 23 ){
                        burc = "Başak burcu";
                    } else {
                        burc = "Terazi Burcu";
                    }
                }else {
                    isError = true;
                }
                break;

            case 10:
                if (birthday >= 1 && birthday <= 31) {
                    if (birthday < 23 ){
                        burc = "Terazi burcu";
                    } else {
                        burc = "Akrep Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            case 11:
                if (birthday >= 1 && birthday <= 31) {
                    if (birthday < 22 ){
                      burc =   "Akrep burcu";
                    } else {
                        burc = "Yay Burcu";
                    }

                }else {
                    isError = true;
                }
                break;

            case 12:
                if (birthday >= 1 && birthday <= 31) {
                    if (birthday <= 22 ){
                       burc =  "Yay burcu";
                    } else {
                       burc = "Oğlak Burcu";
                    }
                }else {
                    isError = true;
                }
                break;
            default: isError = true;

            }
        if (isError){
            System.out.println("Geçersiz giriş yaptınız, lütfen tekrar deniyiniz.");
        } else {
            System.out.println("Burcunuz: " + burc);


        }












    }
}
