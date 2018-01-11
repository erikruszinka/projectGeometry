package sk.akademiasovy.geometry;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double value1)
    {
        a=value1;
    }

    public Rectangle(double value1, double value2)
    {
        b=value2;
        a=value1;
    }
    public Rectangle()
    {
        a=b=0;
    }
    public double getArea(){
        return a*b;
    }

    public double getPerimeter(){
        return 2*(a+b);
    }

    public double getDiagonal(){
        return Math.sqrt(a*a+b*b);
    }

    public void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }
}
