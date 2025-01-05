package com.sercan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Odev_GirilenSayilarda_MIN_MAX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int n = input.nextInt();
        int enBuyuk=Integer.MIN_VALUE;
        int enKucuk=Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println(i +". sayıyı giriniz :");
            int sayi = input.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("En büyük sayi : "+enBuyuk);
        System.out.println("En küçük sayi : "+enKucuk);

    }
}