package ru.nsd.Geometry.figures;

public record Triangle14 (double a, double b, double c){
    public double perimetr() {
        var result = a + b + c;
        System.out.println(String.format("Периметр треугольника со сторонами %f, %f, %f равен %f", a,b,c,result));
        return result;
    }

    public double area() {
        var p = a + b + c;
        return (double) Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-c))*100d)/100d;
    }
}
