public class Circle{
    private String color = "red";
    private double radius;
    //Constructors
    public Circle()
    {
        this.color = "red";
        this.radius = 1.0;
    }
    public Circle(double r)
    {
        this.radius = r;
    
    }
    public Circle(String c, double r)
    {
        this.color = c;
        this.radius = r;
    }

    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String s)
    {
        this.color = s;
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public double getArea()
    {
        return (Math.PI * this.radius * this.radius);
    }

}