package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {

    @Test
    void getHeight() {
    }

    @Test
    void getRadius() {
    }

    @Test
    void setHeight() {
    }

    @Test
    void setRadius() {
    }

    @Test
    void surfaceArea() {
        double expected = 35;
        double actual = new Cone(3.0,2.0).surfaceArea();
        assertEquals(expected,Math.round(actual));
    }

    @Test
    void volume() {
        double expected = 13;
        double actual = new Cone(3.0,2.0).volume();
        assertEquals(expected,Math.round(actual));
    }

    @Test
    void testToString() {
    }
}