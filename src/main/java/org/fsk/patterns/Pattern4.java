package org.fsk.patterns;

public class Pattern4 {

    public static void main(String[] args) {

        int n = 5;

        for (int x = 1; x <= n ; x++) {

            for (int space = 0; space < x - 1; space++) {
                System.out.print(" ");
            }

            for (int star = (n - x + 1); star > 0; star--) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
