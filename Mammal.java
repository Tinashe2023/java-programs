interface Animal{
    void eat();
    public void move();
}
public class Mammal implements Animal{
    public void eat()
    {
        System.out.println("Mammal eats");
    }
    public void move()
    {
        System.out.println("Mammal moves");
    }
    public int noOfLegs()
    {
        return 0;
    }
    public static void main(String args[])
    {
        Mammal m = new Mammal();
        m.eat();
        m.move();
        System.out.println("Number of legs:"+m.noOfLegs());
    }
}
