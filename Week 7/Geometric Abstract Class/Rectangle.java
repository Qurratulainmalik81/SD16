public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle()
    {
        super();
    }
    public Rectangle(double width, double height)
    {
        super();
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width, double height, String color, Boolean filled)
    {
        super(color, filled);
        this.height = height;
        this.width = width;
    
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setWidth(double w)
    {
        this.width = w;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setHeight(double h)
    {
        this.height = h;
    }
 public double getArea()
    {
        return(this.width*this.height);
    }
    public double getPerimeter()
    {
        return 2* (this.height + this.width);
    }

}