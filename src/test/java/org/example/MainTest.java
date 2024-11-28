package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testAdd() {
        Main calc = new Main();
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }
}