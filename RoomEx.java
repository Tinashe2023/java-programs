class Plot
{
    private float length;
    private float width;

    public Plot()
    {
        length=0.0f;
        width = 0.0f;
    }
    public Plot(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    public Plot(Plot p)
    {
        this.length = p.length;
        this.width = p.width;
    }
    public float getLength()
    {
        return length;
    }
    public float getWidth()
    {
        return width;
    }
    float area()
    {
        return length*width;
    }
    public void display()
    {
        System.out.println("Length"+length);
            System.out.println("Width"+width);
                System.out.println("Area"+area());
    }
    public String toString()
    {
        return "Length="+ getLength() +
            "\nWidth="+ getWidth() +
            "\nArea=" + area();
    }
}
class Room extends Plot{
    private float height;

    public Room()
    {
        super();
        this.height=0.0f;
    }
    public Room(float l, float w, float h)
    {
        super(l,w);
        this.height=h;
    }
    public Room(Room r)
    {
        super(r.getLength(), r.getWidth());
        this.height=r.getHeight();
    }
    public float getHeight()
    {
        return height;
    }
    public void setHeight(float h)
    {
        this.height=h;
    }
    public float volume()
    {
        return area()*getHeight();
    }
    public void display()
    {
        System.out.println("Length="+getLength());
        System.out.println("Width="+getWidth());
        System.out.println("Height="+getHeight());
        System.out.println("Area="+area());
        System.out.println("Volume="+volume());
    }
    public String toString()
    {
        return "Length="+getLength() + "\n"+
               "Width="+getWidth() + "\n"+
               "Height="+getHeight() + "\n"+
               "area="+area() + "\n"+
               "Volume="+volume();
    }
}
class RoomEx
{
    public static void main(String[] args)
    {
        Room r1=new Room();
        Room r2=new Room(10.0f,20.0f,30.0f);
        Room r3=new Room(r2);

        System.out.println("\nRoom r1");
        r1.display();
        System.out.println("\nRoom r2");
        r2.display();
        System.out.println("\nRoom r3");
        r3.display();

        System.out.println("\nRoom r1");
        System.out.println(r1);
        System.out.println("\nRoom r2");
        System.out.println(r2);
        System.out.println("\nRoom r3");
        System.out.println(r3);
        System.out.println(r1 instanceof Object);
    }
}