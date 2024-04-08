package org.fsk.algorithms.sortingalgorithms;

public class A5MergeSort {

    /**
     * ==== System.arraycopy() methodu ===
     * -> Bir dizi elemanını başka bir diziye kopyalamak için kullanılır.
     * -> Hızldır.
     * -> System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     * * src: Kaynak dizimiz
     * * srcPos: Kaynak dizimizin hangi pozisyonundan kopyalanmaya baslayacak
     * * dest: Hedef dizimiz
     * * destPos: Kopyalamanin yapilacagi dizinin baslangic pozisyonu
     * * length: Kaynak diziden, hedef diziye kopyalanacak eleman sayisi
     */

    public static void main(String[] args) {


        var array = new int[] {12, 4, 10, 1, 8, 7, 5, 2};
        mergeSort(array);
        for (int element: array) {
            System.out.print(element + " ");
        }
    }

    private static void mergeSort(int[] array) {

        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        /**
         * src: Kaynak dizimiz
         * srcPos: Kaynak dizimizin hangi pozisyonundan kopyalanmaya baslayacak
         * dest: Hedef dizimiz
         * destPos: Kopyalamanin yapilacagi dizinin baslangic pozisyonu
         * length: Kaynak diziden, hedef diziye kopyalanacak eleman sayisi
         */

        System.arraycopy(array, 0, leftArray, 0, mid);
        System.arraycopy(array, mid, rightArray, 0, array.length - mid);

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
