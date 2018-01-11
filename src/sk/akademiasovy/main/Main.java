package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(7.5);
        Square square2 = new Square();

        System.out.println("Area of square1 is "+square1.getArea());
        System.out.println("Perimeter of square1 is "+square1.getPerimeter());
        System.out.println("Diagonal's of square1 is "+square1.getDiagonal());

        Rectangle rectangle1 = new Rectangle(5,8);

        System.out.println("Area of Rectangle1 is "+rectangle1.getArea());
        System.out.println("Perimeter of Rectangle1 is "+rectangle1.getPerimeter());
        System.out.println("Diagonal's of Rectangle1 is "+rectangle1.getDiagonal());


        Triangle triangle1 = new Triangle();
        System.out.println("Area of triangle1 is "+triangle1.getArea());
        System.out.println("Perimeter of triangle1 is "+triangle1.getPerimeter());
        System.out.println("Is the Triangle ractengular "+triangle1.isRectangular());

        System.out.println("Is the Triangle isosceles "+triangle1.isIsosceles());
        System.out.println("Is the triangle Straight sided "+triangle1.isStraightSided());
        System.out.println("Does exist triangle "+triangle1.existTriangle());
    }
}
