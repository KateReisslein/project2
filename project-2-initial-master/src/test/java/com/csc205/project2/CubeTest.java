package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void getWidth() {
    }

    @Test
    void setWidth() {
    }

    @Test
    void surfaceArea() {
        double expected = 96.0;
        double actual = new Cube(4.0).surfaceArea();
        assertEquals(expected,actual);
    }

    @Test
    void volume() {
        double expected = 64.0;
        double actual = new Cube(4.0).volume();
        assertEquals(expected,actual);
    }

    @Test
    void testToString() {
    }
}