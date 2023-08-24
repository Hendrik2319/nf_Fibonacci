package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test void returnMin3_whenFibonacci_getsMin4() { runTestCase(-4, -3); }
    @Test void return___2_whenFibonacci_getsMin3() { runTestCase(-3,  2); }
    @Test void returnMin1_whenFibonacci_getsMin2() { runTestCase(-2, -1); }
    @Test void return___1_whenFibonacci_getsMin1() { runTestCase(-1,  1); }
    @Test void return___0_whenFibonacci_gets___0() { runTestCase( 0,  0); }
    @Test void return___1_whenFibonacci_gets___1() { runTestCase( 1,  1); }
    @Test void return___1_whenFibonacci_gets___2() { runTestCase( 2,  1); }
    @Test void return___2_whenFibonacci_gets___3() { runTestCase( 3,  2); }
    @Test void return___3_whenFibonacci_gets___4() { runTestCase( 4,  3); }

    void runTestCase(int n, int expected) {
        //GIVEN
        //  -> n
        //WHEN
        int actual = Main.fibonacci(n);
        //THEN
        //  -> expected
        Assertions.assertEquals(expected,actual);
    }

    @Test void _returnMin0_3_whenFibonacci_getsMin4__And_0_0__And_0_1() { runTestCase(-4, 0.0, 0.1, -0.3); }
    @Test void _return___0_2_whenFibonacci_getsMin3__And_0_0__And_0_1() { runTestCase(-3, 0.0, 0.1,  0.2); }
    @Test void _returnMin0_1_whenFibonacci_getsMin2__And_0_0__And_0_1() { runTestCase(-2, 0.0, 0.1, -0.1); }
    @Test void _return___0_1_whenFibonacci_getsMin1__And_0_0__And_0_1() { runTestCase(-1, 0.0, 0.1,  0.1); }
    @Test void _return___0_0_whenFibonacci_gets___0__And_0_0__And_0_1() { runTestCase( 0, 0.0, 0.1,  0.0); }
    @Test void _return___0_1_whenFibonacci_gets___1__And_0_0__And_0_1() { runTestCase( 1, 0.0, 0.1,  0.1); }
    @Test void _return___0_1_whenFibonacci_gets___2__And_0_0__And_0_1() { runTestCase( 2, 0.0, 0.1,  0.1); }
    @Test void _return___0_2_whenFibonacci_gets___3__And_0_0__And_0_1() { runTestCase( 3, 0.0, 0.1,  0.2); }
    @Test void _return___0_3_whenFibonacci_gets___4__And_0_0__And_0_1() { runTestCase( 4, 0.0, 0.1,  0.3); }

    void runTestCase(int n, double init0, double init1, double expected) {
        //GIVEN
        //  -> n
        //WHEN
        double actual = Main.fibonacci(n, init0, init1);
        //THEN
        //  -> expected
        Assertions.assertTrue( Math.abs(expected-actual) <= Math.abs(expected)/10000 );
    }

}