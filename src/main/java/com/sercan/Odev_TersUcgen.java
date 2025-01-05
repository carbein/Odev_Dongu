package com.sercan;

public class Odev_TersUcgen {
    public static void main(String[] args) {
        int n=10;
        for (int i=n; i>=1; i--){
            for (int j=0 ;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i-1;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
