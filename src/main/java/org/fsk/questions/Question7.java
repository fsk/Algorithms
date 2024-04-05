package org.fsk.questions;

/**
 * Reverse Integer
 */
public class Question7 {

    public static void main(String[] args) {
        System.out.println(reverseInteger2(123));
    }

    public static int reverseInteger1(int number) {
        int reversed = 0;

        int abs = Math.abs(number);

        while (abs > 0) {
            reversed = reversed * 10 + abs % 10;
            abs = abs / 10;
        }

        return number < 0 ? -reversed : reversed;
    }

    public static int reverseInteger2(int number) {
        if (number < 0) {
            String val = number + "";
            String withoutMinus = val.replace("-", "");
            StringBuilder value = new StringBuilder(withoutMinus);
            return -Integer.parseInt(value.reverse().toString());
        }else {
            StringBuilder value = new StringBuilder(String.valueOf(number));
            return Integer.parseInt(value.reverse().toString());
        }
    }
}
