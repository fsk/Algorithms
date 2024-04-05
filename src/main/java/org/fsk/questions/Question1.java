package org.fsk.questions;

import org.fsk.Result;
import org.fsk.ToJSON;

/**
 * Bir sayinin prime (asal) olup olmadigini bulan program
 */
public class Question1 {

    public static void main(String[] args) throws Exception {

        ToJSON<Integer> JSONFile =  new ToJSON<>();

        int input = 999999999;

        Result<Integer> result1 = new Result<>();

        long tStart = System.nanoTime();
        isPrime1(input);
        long tEnd = System.nanoTime();

        result1.setQuestion("Is Prime");
        result1.setInput(input);
        result1.setExecutionTime(tEnd - tStart);
        result1.setMethodName("isPrime1");

        System.out.println(result1);

        JSONFile.fromResultToJSON(result1);

        System.out.println("============================");


        Result<Integer> result2 = new Result<>();

        long tStart2 = System.nanoTime();
        isPrime2(input);
        long tEnd2 = System.nanoTime();

        result2.setQuestion("Is Prime");
        result2.setInput(input);
        result2.setExecutionTime(tEnd2 - tStart2);
        result2.setMethodName("isPrime2");

        System.out.println(result2);

        JSONFile.fromResultToJSON(result2);


    }


    public static boolean isPrime1(int n) {
        double t1 = System.nanoTime();
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }


    public static boolean isPrime2(int n) {
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
