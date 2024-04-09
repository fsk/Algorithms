package org.fsk.algorithms.stack;

import java.util.List;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack<String> cities = new Stack<>();



        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");
        cities.add("Eskisehir");

        System.out.println(cities);

        String pop1 = cities.pop();

        System.out.println(pop1);

        System.out.println(cities);

        cities.push("Canakkale");

        System.out.println(cities);

        cities.pop();

        System.out.println(cities);

        System.out.println(cities.peek());

        cities.add(1, "Hakkari");

        System.out.println(cities);

        cities.add(7, "Antalya");


    }

}
