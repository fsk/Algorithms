package org.fsk.algorithms.stack;

public class MyStackClass<T> {

    private T[] stackArray;

    /**
     * top değeri stackArray içerisindeki en üstteki elemanin indexini tutar
     */
    private int top;

    public MyStackClass() {
        stackArray = (T[]) new Object[1];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    public T peek() {
        if (isEmpty()) {
            System.err.println("Stack is empty, cannot peek");
        }

        return stackArray[top];
    }

    public void push(T item) {
        if (isFull()) {
            resize(2 * stackArray.length);
        }

        /**
         * ++top: İlk olarak, top değişkenini arttırır. top, stack'in en üstündeki
         * elemanin indeksini tutar. Stack boşken -1 değerindedir. çünkü array indeksleri 0'dan başlar.
         * Bu yüzden bir eleman eklenmedeni önce top'u arttirarak, top'un stack'e eklenmek üzere
         * olan yeni eleman için doğru indeksi işaret etmesini sağlariz.
         *
         * stackArray[top] = item; artirilmiş top indeksindeki pozisyona, yani stackin en
         * üstüne, yeni elemani (item) yerlestirir. Bu stack'e bir elemanin eklenmesi islemini tamamlar.
         */
        stackArray[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            System.err.println("Stack is empty, cannot pop");
            return null;
        }

        T item = stackArray[top];

        stackArray[top] = null;
        top--;

        /**
         * Stack'in kullaniminin, altinda yatan dizinin kapasitesinin ceyregine düstügünü kontrol eder.
         * Yani, dizinin %25'i kullaniliyor ve geri kalani bos ise dizinin boyutunu kücültmeyi dusunuruz.
         */
        if (top > 0 && top == stackArray.length / 4) {
            resize(stackArray.length / 2);
        }

        return item;
    }




    private void resize(int newSize) {
        T[] transferArray = (T[]) new Object[newSize];
        System.arraycopy(stackArray, 0, transferArray, 0, top + 1);
        stackArray = transferArray;
    }

    public void printStack() {
        for (T element : stackArray) {
            System.out.println(element);
        }
    }
}
