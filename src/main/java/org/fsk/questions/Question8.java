package org.fsk.questions;

/**
 * Two integer divide
 */
public class Question8 {

    public static void main(String[] args) {
        System.out.println(result(12, -4));
    }

    public static int result(int dividend, int divisor) {

        if (divisor == 0) {
            throw  new ArithmeticException("Dividend by 0");
        }

        int sign = 1;

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        dividend = dividend < 0 ? -dividend : dividend;
        divisor = divisor < 0 ? -divisor : divisor;

        int quotient = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        return sign * quotient;
    }
}
