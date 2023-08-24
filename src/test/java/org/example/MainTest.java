package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test void return0_whenFibonacci_gets0() { testACase(0, 0); }
    @Test void return1_whenFibonacci_gets1() { testACase(1, 1); }
    @Test void return1_whenFibonacci_gets2() { testACase(2, 1); }
    @Test void return2_whenFibonacci_gets3() { testACase(3, 2); }

    void testACase(int rowIndex, int expectedNumber) {
        //GIVEN
        int number = rowIndex;
        //WHEN
        int actual = Main.fibonacci(number);
        //THEN
        int expected = expectedNumber;
        Assertions.assertEquals(expected,actual);
    }


}