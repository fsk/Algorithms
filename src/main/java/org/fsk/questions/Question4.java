package org.fsk.questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Duplicate Words in Sentence
 */

public class Question4 {

    public static void main(String[] args) {

        String msg = "ankara yazilim ankara furkan ankara yazilim";

        long tStart1 = System.nanoTime();
        duplicateWords1(msg);
        long tEnd1 = System.nanoTime();

        long tStart2 = System.nanoTime();
        duplicateWords2(msg);
        long tEnd2 = System.nanoTime();

        System.out.println("1 -> " + (tEnd1 - tStart1) + " <==> 2 -> " + (tEnd2 - tEnd1));
    }

    public static List<String> duplicateWords1(String sentence) {

        List<String> stringList = new ArrayList<>();
        String[] arr = sentence.split(" ");

        Map<String, Integer> duplicateWords = new HashMap<>();

        for (String item : arr) {
            if (duplicateWords.containsKey(item)) {
                duplicateWords.put(item, duplicateWords.get(item) + 1);
            }else duplicateWords.put(item, 1);
        }

        for (Map.Entry<String, Integer> entry : duplicateWords.entrySet()) {
            if (entry.getValue() > 1) {
                stringList.add(entry.getKey());
            }
        }


        return stringList;

    }

    public static List<String> duplicateWords2(String sentence) {

        Map<String, Long> duplicateWords = Arrays
                .stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return duplicateWords
                .entrySet()
                .stream()
                .filter(item -> item.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

    }
}
