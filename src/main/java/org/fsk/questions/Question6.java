package org.fsk.questions;

import org.fsk.Result;

/**
 * Reverse String
 */
public class Question6 {

    public static void main(String[] args) {
        String question = "Reverse String";
        String sentence = "FSK Algorithm lessons, this video is about of reversed String";

        Result<String> result1 = new Result<>();
        result1.setQuestion(question);
        result1.setInput(sentence);
        result1.setMethodName("reverse1");

        long tStart1 = System.nanoTime();
        reverse1(sentence);
        long tEnd1 = System.nanoTime();

        result1.setExecutionTime(tEnd1 - tStart1);

        System.out.println(result1);

        System.out.println("===============================");

        Result<String> result2 = new Result<>();
        result2.setQuestion(question);
        result2.setInput(sentence);
        result2.setMethodName("reverse2");


        long tStart2 = System.nanoTime();
        reverse2(sentence);
        long tEnd2 = System.nanoTime();

        result2.setExecutionTime(tEnd2 - tStart2);

        System.out.println(result2);

        System.out.println("===============================");

        Result<String> result3 = new Result<>();

        result3.setQuestion(question);
        result3.setInput(sentence);
        result3.setMethodName("reverse3");

        long tStart3 = System.nanoTime();
        reverse3(sentence);
        long tEnd3 = System.nanoTime();

        result3.setExecutionTime(tEnd3 - tStart3);

        System.out.println(result3);
    }

    public static String reverse1(String s) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString.append(s.charAt(i));
        }

        return reversedString.toString();
    }

    public static String reverse2(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    public static String reverse3(String s) {

        char[] characters = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;

        }

        return new String(characters);
    }

}
