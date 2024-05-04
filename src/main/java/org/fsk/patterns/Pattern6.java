package org.fsk.patterns;

public class Pattern6 {

    public static void main(String[] args) {


        int n = 5;

        for (int x = 1; x <= n; x++) {

            //bosluk dongusu
            for (int space = 0; space < (x - 1); space++) {
                System.out.print(" ");
            }

            //star bastiran dongu
            for (int star = 1; star <= (2 * (n - x) + 1); star++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
