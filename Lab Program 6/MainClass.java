abstract class Shapes
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shapes{
    int radius;
    Circle(int r)
    {
        radius=r;
    }
    double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}
class Triangle extends Shapes{
    int side1,side2,side3;
    Triangle(int side1,int side2,int side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    double calculateArea()
    {
        double s=(side1+side2+side3)/2.0f;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    double calculatePerimeter()
    {
        return side1+side2+side3;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Circle c=new Circle(3);
        System.out.print("Area of the circle with radius "+c.radius+" is "+c.calculateArea()+"\n");
        System.out.print("Perimeter of the circle with radius "+c.radius+" is "+c.calculatePerimeter());

        Triangle t=new Triangle(3, 4, 5);
        System.out.print("\n\nArea of the Triangle with sides "+t.side1+" "+t.side2+" "+t.side3+" is "+t.calculateArea()+"\n");
        System.out.print("Perimeter of the Triangle with sides "+t.side1+" "+t.side2+" "+t.side3+" is "+t.calculatePerimeter()+"\n");
    }
}
