package com.sercan;

public class Odev_AsalSayi {
    public static void main(String[] args) {
        for (int sayi=2;sayi<=100;sayi++){
            if (Asalmi(sayi)){
                System.out.print(sayi+" ");
            }

        }
    }
    // Asallık kontrolü yapan metod
    public static boolean Asalmi(int sayi){
        if (sayi<2){    // 2'den küçük sayılar asal değildir
            return false;
        }
        for (int i=2;i<=Math.sqrt(sayi);i++){
            if (sayi%i==0){ // Eğer sayı bir başka sayıya tam bölünüyorsa asal değildir
                return false;
            }
        }
        return true;// Sayı yalnızca 1 ve kendisine bölünüyorsa asal sayıdır
    }
}
