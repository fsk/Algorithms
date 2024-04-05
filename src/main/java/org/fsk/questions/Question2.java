package org.fsk.questions;


import org.fsk.Result;
import org.fsk.ToJSON;

/**
 * Check Perfect(Mukemmel) Number
 */
public class Question2 {

    public static void main(String[] args) throws Exception {

        ToJSON<Integer> toJSON = new ToJSON<>();

        Result<Integer> result1 = new Result<>();

        long tStart1 = System.nanoTime();
        isPerfectNumber1(33550336);
        long tEnd1 = System.nanoTime();


        result1.setQuestion("Check Perfect Number");
        result1.setInput(33550336);
        result1.setMethodName("isPerfectNumber1");
        result1.setExecutionTime(tEnd1 - tStart1);

        System.out.println(result1);

        toJSON.fromResultToJSON(result1);

        System.out.println("============================");


        Result<Integer> result2 = new Result<>();

        long tStart2 = System.nanoTime();
        isPerfectNumber2(33550336);
        long tEnd2 = System.nanoTime();


        result2.setQuestion("Check Perfect Number");
        result2.setInput(33550336);
        result2.setMethodName("isPerfectNumber1");
        result2.setExecutionTime(tEnd2 - tStart2);

        System.out.println(result2);

        toJSON.fromResultToJSON(result2);


    }

    public static boolean isPerfectNumber1(int num) {

        if (num <= 0 || num % 2 != 0) {
            return false;
        }

        int count = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count = count + i;
            }
        }

        return num == count;
    }

    public static boolean isPerfectNumber2(int num) {
        if (num < 0 || num % 2 != 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;

    }
}
