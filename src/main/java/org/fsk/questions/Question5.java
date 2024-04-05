package org.fsk.questions;

import org.fsk.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Pythagoras Triples That sum of 1000
 */
public class Question5 {

    public static void main(String[] args) {

        long tStart1 = System.nanoTime();
        System.out.println(pythagorasTriples1());
        long tEnd1 = System.nanoTime();

        long tStart2 = System.nanoTime();
        System.out.println(pythagorasTriples2());
        long tEnd2 = System.nanoTime();

        System.out.println("Algorithm1 Execution Time ==> " + (tEnd1 - tStart1));
        System.out.println("Algorithm2 Execution Time ==> " + (tEnd2 - tStart2));
    }

    public static List<Integer> pythagorasTriples1() {

        List<Integer> triples = new ArrayList<>();

        int total = 1000;

        for (int a = 1; a <= total; a++) {
            for (int b = 1; b <= total; b++) {
                for (int c = 1; c <= total; c++) {
                    if (
                            ((a < b) && (a < c) && (b < c) &&
                            ((a*a) + (b*b) == (c*c))) &&
                            (a + b + c) == total
                    ) {
                        triples.add(a);
                        triples.add(b);
                        triples.add(c);
                    }
                }
            }
        }
        return triples;
    }

    public static List<Integer> pythagorasTriples2() {

        List<Integer> triples = new ArrayList<>();

        int total = 1000;

        for (int a = 1; a < total / 3; a++) {
            for (int b = a + 1; b < total / 2; b++) {
                int c = total - a - b;
                if ((a * a) + (b * b) == (c * c)) {
                    triples.add(a);
                    triples.add(b);
                    triples.add(c);
                }
            }
        }
        return triples;
    }
}
