package sk.akademiasovy.geometry;

public class Triangle {


    private double a;
    private double b;
    private double c;

    public Triangle() {

        a=6;
        b=7;
        c=8;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter()
    {
        return a+b+c;
    }

    public double getArea()
    {
        double s;
        s=(a+b+c)/2;
        double area=Math.sqrt (s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public boolean isRectangular(){
        if(a*a+b*b==c*c)
            return true;
        else if(a*a+c*c==b*b)
            return true;
        else if(b*b+c*c==a*a)
            return true;
        else
            return false;
    }

    public boolean existTriangle(){
        if (a>(c+b))
          return true;
        else if (b>(a+c))
                return true;
        else if (c>(b+a))
                return true;
        else
            return false;
    }

    public boolean isIsosceles(){
        if ((a==b) || (b==c) || (c==a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isStraightSided(){
        if((a==b) && (b==c))
            return true;
          else
            return false;
    }

}
