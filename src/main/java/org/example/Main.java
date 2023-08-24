package org.example;

public class Main {
    public static void main(String[] args) {
        for (int n=-4; n<=4; n++)
            System.out.println("Fibonacci( "+ n +" ) = " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        int fib0 = 0;
        int fib1 = 1;
        int sumFib = -1;

        if (n==0)
            return fib0;

        if (n==1)
            return fib1;

        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                sumFib = fib0 + fib1;
                fib0 = fib1;
                fib1 = sumFib;
            }
        } else {
            for (int i = -1; i >= n; i--) {
                sumFib = fib1 - fib0;
                fib1 = fib0;
                fib0 = sumFib;
            }
        }

        return sumFib;
    }

    public static double fibonacci(int n, double init0, double init1) {
        double fib0 = init0;
        double fib1 = init1;
        double sumFib = Double.NaN;

        if (n==0)
            return fib0;

        if (n==1)
            return fib1;

        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                sumFib = fib0 + fib1;
                fib0 = fib1;
                fib1 = sumFib;
            }
        } else {
            for (int i = -1; i >= n; i--) {
                sumFib = fib1 - fib0;
                fib1 = fib0;
                fib0 = sumFib;
            }
        }

        return sumFib;
    }
}