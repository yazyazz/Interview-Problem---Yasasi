package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void test1() {
        String ops1 = main.mathFunction(1, 2, 3);
        assertEquals("+", ops1);
    }

    @Test
    public void test2() {
        String ops2 = main.mathFunction(2, 2, 4);
        assertEquals("+*", ops2);
    }

    @Test
    public void test3() {
        String ops3 = main.mathFunction(3, -3, -9);
        assertEquals("*", ops3);
    }

    @Test
    public void test4() {
        String ops4 = main.mathFunction(1, 2, -1);
        assertEquals("-", ops4);
    }

    @Test
    public void test5() {
        String ops5 = main.mathFunction(3, 3, 1);
        assertEquals("/", ops5);
    }

    @Test
    public void test6() {
        String ops6 = main.mathFunction(7, 1, 11);
        assertEquals("None", ops6);
    }
}
