package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test void returnMin3_whenFibonacci_getsMin4() { testACase(-4, -3); }
    @Test void return2____whenFibonacci_getsMin3() { testACase(-3,  2); }
    @Test void returnMin1_whenFibonacci_getsMin2() { testACase(-2, -1); }
    @Test void return1____whenFibonacci_getsMin1() { testACase(-1,  1); }
    @Test void return0____whenFibonacci_gets0   () { testACase( 0,  0); }
    @Test void return1____whenFibonacci_gets1   () { testACase( 1,  1); }
    @Test void return1____whenFibonacci_gets2   () { testACase( 2,  1); }
    @Test void return2____whenFibonacci_gets3   () { testACase( 3,  2); }
    @Test void return2____whenFibonacci_gets4   () { testACase( 4,  3); }

    void testACase(int n, int expected) {
        //GIVEN
        //  -> n
        //WHEN
        int actual = Main.fibonacci(n);
        //THEN
        //  -> expected
        Assertions.assertEquals(expected,actual);
    }


}