package org.fsk.patterns;

public class Pattern3 {


    public static void main(String[] args) {

        int n = 5;

        for (int x = 1; x <= n; x++) {

            //space yazdirir
            for (int space = 0; space < (n - x); space++) {
                System.out.print(" ");
            }

            //Yildizlari bastirir
            for (int star = 0; star < x; star++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
