package com.sercan;

import java.util.Scanner;

public class Odev_MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = inp.nextInt();
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam+=i;

            }

        }
        if (toplam==sayi){
            System.out.println(sayi+" mükemmel bir sayidir.");
        }else System.out.println(sayi+" mükemmel bir sayi değildir.");
    }
}
