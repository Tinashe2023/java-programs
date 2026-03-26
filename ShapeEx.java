abstract class Shape{
    abstract void draw();
    void show()
    {
        System.out.println("Shape shown");
    }
}
class Circle extends Shape{
    void draw()
    {
        System.out.println("Circle drawn");
    }
}
class Rectangle extends Shape{
    void draw()
    {
        System.out.println("Rectangle drawn");
    }
}
class Triangle extends Shape{
    void draw()
    {
        System.out.println("Triangle drawn");
    }
}
public class ShapeEx{
    public static void main(String[] args){
        Shape s1;
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();

        System.out.println("\nCircle");
        s1 = c1;
        s1.draw();
        s1.show();

        System.out.println("\nRectangle");
        s1 = r1;
        s1.draw();
        s1.show();

        System.out.println("\nTriangle");
        s1 = t1;
        s1.draw();
        s1.show();

        
    }
}