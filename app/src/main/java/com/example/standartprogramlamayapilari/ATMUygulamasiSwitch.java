package com.example.standartprogramlamayapilari;
import java.util.Scanner;

public class ATMUygulamasiSwitch {

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
                while (true){
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");
                    System.out.println("" +
                            "           1- Para Yatırma \n" +
                            "           2- Para Çekme\n" +
                            "           3- Bakiye Sorgulama\n" +
                            "           4- Çıkış");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiye: " + balance);
                            break;

                        case 2:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz!");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiye: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            input.close();
                            return;  // Exit the program

                        default:
                            System.out.println("Geçersiz işlem seçimi!");
                            break;
                    }
                }

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
