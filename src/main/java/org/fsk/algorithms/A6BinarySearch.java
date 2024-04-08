package org.fsk.algorithms;

import java.util.Arrays;

public class A6BinarySearch {

    public static void main(String[] args) {

        //System.out.println(searchIterative(new int[]{6, 10, 5, 12, 4, 3}, 10));
        System.out.println(searchRecursive(new int[]{6, 10, 5, 12, 4, 3}, 10, 0, 5));

    }

    private static int searchIterative(int[] numbers, int target) {

        Arrays.sort(numbers);

        int index = -1;

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (numbers[mid] < target) {
               low = mid + 1;
            }else if (numbers[mid] > target) {
                high = mid - 1;
            }else if (numbers[mid] == target) {
                index = mid;
                break;
            }

        }

        return index;

    }

    private static int searchRecursive(int[] numbers, int target, int lowIndex, int highIndex) {

        Arrays.sort(numbers);

        int mid = lowIndex + ((highIndex - lowIndex) / 2);

        if (highIndex < lowIndex) {
            return -1;
        }

        if (target == numbers[mid]) {
            return mid;
        }else if (target < numbers[mid]) {
            return searchRecursive(numbers, target, lowIndex, mid - 1);
        }else return searchRecursive(numbers, target, mid + 1, highIndex);


    }
}
