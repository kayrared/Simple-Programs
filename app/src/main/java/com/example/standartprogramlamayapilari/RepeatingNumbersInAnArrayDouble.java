package com.example.arrays;

public class RepeatingNumbersInAnArrayDouble {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Daha önce dizide var mı diye kontrol etme
    static boolean isFind(int[] arr, int value, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 2, 4, 5, 2, 9, 4, 6, 2, 10, 6};

        int[] duplicate = new int[list.length];
        int startIndex = 0;


        for (int i = 0; i < list.length; i++) {
            // Çift sayıları kontrol et
            if (isEven(list[i])) {
                // Daha önce eklenmiş mi?
                if (!isFind(duplicate, list[i], startIndex)) {
                    // Eğer çift sayı daha önce eklenmemişse, bunu bir sonraki alana ekle
                    for (int j = i + 1; j < list.length; j++) {
                        if (list[i] == list[j]) {
                            // Eğer tekrar eden bir çift sayısı bulursak, ekleyelim
                            duplicate[startIndex++] = list[i];
                            break;
                        }
                    }
                }
            }
        }

        // Duplicate dizisini yazdırırken yalnızca eklenmiş sayıları kullanıyoruz
        System.out.print("Duplicate: ");
        for (int i = 0; i < startIndex; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}
