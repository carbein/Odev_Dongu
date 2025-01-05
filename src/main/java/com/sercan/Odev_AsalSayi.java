package com.sercan;

public class Odev_AsalSayi {
    public static void main(String[] args) {
        for (int sayi=2;sayi<=100;sayi++){
            if (Asalmi(sayi)){
                System.out.print(sayi+" ");
            }

        }
    }
    public static boolean Asalmi(int sayi){
        if (sayi<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(sayi);i++){
            if (sayi%i==0){
                return false;
            }
        }
        return true;
    }
}
