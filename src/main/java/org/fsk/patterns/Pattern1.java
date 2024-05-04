package org.fsk.patterns;

public class Pattern1 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) { //satir sayisi

            for (int j = 1; j <= i; j++) { //yildiz sayisi

                System.out.print("*");

            }
            System.out.println();

        }

    }
}
