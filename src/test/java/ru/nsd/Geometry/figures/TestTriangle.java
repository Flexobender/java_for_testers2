package ru.nsd.Geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTriangle {
    @Test
    void canCalculatePerimetr(){
        Triangle triangle = new Triangle( 2.,2., 5.);
         var result = triangle.perimetr();
        Assertions.assertEquals(9., result);
        }
    @Test
    void canCalculateArea() {
        Triangle triangle = new Triangle(10., 10., 20.);
        Assertions.assertEquals(848.53, triangle.area());
    }
    @Test
    void canCalculateArea14(){
        Triangle14 triangle14 = new Triangle14(10., 10., 20.);
        Assertions.assertEquals(848.53, triangle14.area());
    }
}
