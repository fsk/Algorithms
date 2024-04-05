package org.fsk.questions;

import org.fsk.Result;

/**
 * Is number perfect Square
 */
public class Question9 {

    public static void main(String[] args) {
        long tStart1 = System.nanoTime();
        System.out.println(isPerfectSquare1(9999999999L));
        long tEnd1 = System.nanoTime();

        System.out.println("Lineer Search ==> " + (tEnd1 - tStart1));

        System.out.println("====================================");

        long tStart2 = System.nanoTime();
        System.out.println(isPerfectSquare2(9999999999L));
        long tEnd2 = System.nanoTime();

        System.out.println("Binary Search ==> " + (tEnd2 - tStart2));
    }

    public static boolean isPerfectSquare1(long num) {

        for (long i = 1; i <= num; i++) {
            if (num % i == 0 && num / i == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare2(long num) {

        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + ((end - start) / 2);
            if (mid * mid == num) return true;
            else if (mid * mid > num) {
                end = mid - 1;
            }else if (mid * mid < num) {
                start = mid + 1;
            }
        }

        return false;
    }
}
