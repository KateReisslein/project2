package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @Test
    void getRadius() {
    }

    @Test
    void setRadius() {
    }

    @Test
    void surfaceArea() {
        double expected = 13;
        double actual = new Sphere(1.0).surfaceArea();
        assertEquals(expected,Math.round(actual));
    }

    @Test
    void volume() {
        double expected = 4.0;
        double actual = new Sphere(1.0).volume();
        assertEquals(expected,Math.round(actual));
    }

    @Test
    void testToString() {
    }
}