package org.fsk.algorithms.sortingalgorithms;

public class A1BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {12, 33, 27, 30, 9};
        bubbleSort(numbers);
        for (Integer item : numbers) {
            System.out.println(item);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; //temporary
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
