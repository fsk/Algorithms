package org.fsk.questions;

import java.util.Arrays;

/**
 * Is Anagram
 */
public class Question10 {

    public static void main(String[] args) {

        System.out.println(isAnagram2("sakarya", "aksaray"));

    }

    public static boolean isAnagram(String s, String t) {
        //ankara, knrarak
        if (s.length() != t.length()) return false;

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);

        return Arrays.equals(sCharArr, tCharArr);
    }

    public static boolean isAnagram2(String str1, String str2) {

        int charCount = 256;

        if (str1.length() != str2.length()) return false;

        int[] count1 = new int[charCount];
        int[] count2 = new int[charCount];

        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count2[str2.charAt(i)]++;
        }

        for (int i = 0; i < charCount; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;

    }



}
