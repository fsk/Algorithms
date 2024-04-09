package org.fsk.questions;

import java.util.ArrayList;
import java.util.List;

public class Question11 {

    public static void main(String[] args) {
        System.out.println(isUgly3(12));
    }


    public static boolean isUgly1(int n) {

        List<Integer> isUglyList = primeFactorList(n);

        if (isUglyList.size() > 3) {
            return false;
        }else {
            List<Integer> listUgly = isUglyList
                    .stream()
                    .filter(item -> item > 5)
                    .toList();

            return listUgly.isEmpty();
        }

    }

    private static List<Integer> primeFactorList(int n) {
        List<Integer> primeFactorList = new ArrayList<>();
        for (int i = 2; i <= n ; i++) {
            if (n % i == 0 && isPrime(i)) {
                primeFactorList.add(i);
            }
        }
        return primeFactorList;
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 1;
    }


    private static boolean isUgly2(int n) {
        int[] divisors = {2, 3, 5};
        for (int item : divisors) {
            while (n % item == 0) {
                n = n / item;
            }
        }

        return n == 1;
    }

    private static boolean isUgly3(int n) {

        if (n == 0) {
            return false;
        }else if (n == 1) {
            return true;
        }

        if (n % 2 == 0) return isUgly3(n / 2);
        if (n % 3 == 0) return isUgly3(n / 3);
        if (n % 5 == 0) return isUgly3(n / 5);

        return false;
    }
}
