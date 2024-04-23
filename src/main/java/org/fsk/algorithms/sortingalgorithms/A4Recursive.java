package org.fsk.algorithms.sortingalgorithms;

/**
 * 1- Durma sarti
 * 2- Return ifadesinde methodun adi yer almali.
 */
public class A4Recursive {

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(fib(7));
        System.out.println(pow(5,-2));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else return n * factorial(n - 1);
    }


    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }else return fib(n - 1) + fib(n - 2);
    }


    public static double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }else if (exponent == 1) {
            return base;
        }else if (exponent < 0) {
            return 1 / pow(base, -exponent);
        }else return base * pow(base, exponent - 1);
    }
}
