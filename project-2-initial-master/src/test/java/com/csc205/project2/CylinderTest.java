package com.csc205.project2;

import static org.junit.jupiter.api.Assertions.*;
class CylinderTest {

    @org.junit.jupiter.api.Test
    void getHeight() {
    }

    @org.junit.jupiter.api.Test
    void getRadius() {
    }

    @org.junit.jupiter.api.Test
    void setHeight() {
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
    }

    @org.junit.jupiter.api.Test
    void surfaceArea() {
        double expected = 88.0;
        double actual = new Cylinder(5.0,2.0).surfaceArea();
        assertEquals(expected,Math.round(actual));
    }

    @org.junit.jupiter.api.Test
    void volume() {
        double expected = 63;
        double actual = new Cylinder(5.0,2.0).volume();
        assertEquals(expected,Math.round(actual));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}