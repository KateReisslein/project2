package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquarePyramidTest {

    @Test
    void getHeight() {
    }

    @Test
    void getBaseEdge() {
    }

    @Test
    void setHeight() {
    }

    @Test
    void setBaseEdge() {
    }

    @Test
    void surfaceArea() {
        double expected = 20;
        double actual = new SquarePyramid(4.0,2.0).surfaceArea();
        assertEquals(expected,Math.round(actual));
    }

    @Test
    void volume() {
        double expected = 5;
        double actual = new SquarePyramid(4.0,2.0).volume();
        assertEquals(expected,Math.round(actual));
    }

    @Test
    void testToString() {
    }
}