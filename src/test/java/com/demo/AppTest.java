package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreet() {
        assertEquals("Hello CI Pipeline!", App.greet());
    }
    @Test
    void testDisplay() {
        assertEquals("display data", App.display());
    }
    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testSquare() {
        assertEquals(25, App.square(5));
    }
}
