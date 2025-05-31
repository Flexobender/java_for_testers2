package ru.nsd.Geometry;

import ru.nsd.Geometry.figures.Triangle14;

public class Geometry {
    public static void main(String[] args) {
        Triangle14 triangle14 = new Triangle14(3., 3., 3.);
        triangle14.perimetr();
        triangle14.area();
    }
}
