package org.example;

public class Main {
    public static void main(String[] args) {
        int eingabe = 1;
        System.out.println("Fibonacci( "+ eingabe +" ) = " + fibonacci(eingabe));
    }

    public static int fibonacci(int n) {
        int fib0 = 0;
        int fib1 = 1;
        int sumFib = -1;

        if (n==0)
            return fib0;

        if (n==1)
            return fib1;

        for (int i = 2; i <= n; i++) {
            sumFib = fib0 + fib1;
            fib0 = fib1;
            fib1 = sumFib;
        }
        return sumFib;
    }
}