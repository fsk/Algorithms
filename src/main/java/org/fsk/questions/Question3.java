package org.fsk.questions;


import org.fsk.Result;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Number Is Happy
 */

public class Question3 {

    public static void main(String[] args) {

        int input = 9999999;
        Result<Integer> result1 = new Result<>();

        long tStart1 = System.nanoTime();
        isHappy1(input);
        long tEnd1 = System.nanoTime();

        result1.setQuestion("Is Happy Number");
        result1.setInput(input);
        result1.setMethodName("isHappy1");
        result1.setExecutionTime(tEnd1 - tStart1);

        System.out.println(result1);


        System.out.println("==================================");

        Result<Integer> result2 = new Result<>();

        long tStart2 = System.nanoTime();
        System.out.println(isHappy2(input));
        long tEnd2 = System.nanoTime();

        result2.setInput(input);
        result2.setExecutionTime(tEnd2 - tStart2);

        System.out.println(result2);

    }

    public static boolean isHappy1(int n) {

        ArrayList<Integer> nums = new ArrayList<>();
        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            nums.add(Integer.parseInt(number.substring(i, i+1)));
        }

        int squareTotal = nums
                .stream()
                .mapToInt(item -> (int) (Math.pow(item, 2)))
                .sum();

        if (squareTotal == 1 || squareTotal == 7) {
            return true;
        }else if (String.valueOf(squareTotal).length() == 1) {
            return false;
        }else return isHappy1(squareTotal);
    }

    public static boolean isHappy2(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        return sum;
    }
}
