package com.example.standartprogramlamayapilari;

import java.util.Scanner;

public class BurcProgramIf {

    public static void main(String args[]) {

        int day, month;
        String burc = "";
        boolean isError = false;


        Scanner input = new Scanner(System.in);
        System.out.println("(1)Ocak\n(2)Şubat\n(3)Mart\n(4)Nisan\n(5)Mayıs" +
                "\n(6)Haziran\n(7)Temmuz\n(8)Ağustos\n(9)Eylül\n(10)Ekim\n(11)Kasım\n(12)Aralık");
        month = input.nextInt();

        System.out.println("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if (month == 1) {

            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "oglak";
                } else{
                    burc = "kova";
                }
            } else{
                isError = true;
            }
        }
        if (month == 2) {

            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "kova";
                } else{
                    burc = "balık";
                }
            }else{
                isError = true;
            }
        }
        if (month == 3) {

            if (day >= 1 && day <= 28) {
                if (day < 21) {
                    burc = "balık";
                } else{
                    burc = "koç";
                }
            }else{
                isError = true;
            }
        }
        if (month == 4) {

            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "koç";
                } else{
                    burc = "boğa";
                }
            }else{
                isError = true;
            }
        }
        if (month == 5) {

            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "boğa";
                } else{
                    burc = "ikizler";
                }
            }else{
                isError = true;
            }
        }
        if (month == 6) {

            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "ikizler";
                } else{
                    burc = "yengeç";
                }
            }else{
                isError = true;
            }
        }
        if (month == 7) {

            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "yengeç";
                } else{
                    burc = "aslan";
                }
            }else{
                isError = true;
            }
        }
        if (month == 8) {

            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "aslan";
                } else{
                    burc = "başak";
                }
            }else{
                isError = true;
            }
        }
        if (month == 9) {

            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "başak";
                } else{
                    burc = "terazi";
                }
            }else{
                isError = true;
            }
        }
        if (month == 10) {

            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "terazi";
                } else{
                    burc = "akrep";
                }
            }else{
                isError = true;
            }
        }
        if (month == 11) {

            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "akrep";
                } else{
                    burc = "yay";
                }
            }else{
                isError = true;
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "yay";
                } else{
                    burc = "oğlak";
                }
            }else{
                isError = true;
            }
        }
        if (isError){
            System.out.println("Geçersiz giriş yaptınız, lütfen tekrar deniyiniz.");
        } else if (month > 12){
            System.out.println("Geçersiz değer girişi yaptınız lütfen tekrar deneyiniz.");
        }
        else {
            System.out.println("Burcunuz: " + burc);
        }











    }
}
