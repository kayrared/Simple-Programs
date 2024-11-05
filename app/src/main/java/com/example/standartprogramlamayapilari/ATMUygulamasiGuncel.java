package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class ATMUygulamasiGuncel {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;
        int price;

        while (right > 0){
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifre giriniz: ");
        password = input.nextLine();

        if (userName.equals("admin") && password.equals("123") ){
            System.out.println("Sisteme giriş yaptınız.");
           do {
               System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");
               System.out.println("" +
                       "           1- Para Yatırma \n" +
                       "           2- Para Çekme\n" +
                       "           3- Bakiye Sorgulama\n" +
                       "           4- Çıkış");
               select = input.nextInt();

               if (select == 1){
                   System.out.println("Para miktarı: ");
                    price = input.nextInt();

                    balance += price;

               } else if (select == 2) {
                   System.out.println("Para miktarı: ");
                   price = input.nextInt();
                   if (price > balance){
                       System.out.println("Bakiye Yetersiz!");
                   } else {
                       balance -= price;
                   }
               } else if (select == 3) {
                   System.out.println("Bakiyeniz: " + balance);

               }
           }while(select != 4);

            break;

        } else {

                --right;
            if (right == 0){
                System.out.println("Hesabınız bloke olmuştur");
                System.out.println("Lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kullanıcı adı veya şifre yanlış. .");
                System.out.println("Kalan hakkınız: " + right);
            }
        }
        }







    }
}
