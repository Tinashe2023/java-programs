interface Shape{
    public void draw();
    default void show()
    {
        System.out.println("Shape shown");
    }
}
class Circle implements Shape{
    public void draw()
    {
        System.out.println("Circle drawn");
    }
}
public class Default{
    public static void main(String[] args)
    {
       Circle c1 = new Circle();   
       c1.draw();
       c1.show();
    }
}