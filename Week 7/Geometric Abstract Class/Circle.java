public class Circle extends GeometricObject{
    private double radius;
    public Circle()
    {
        super();
    }
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean Filled)
    {
        super(color, Filled);
        this.radius = radius;

    }
    private double getRadius()
    {
        return this.radius;

    }
    private void setRadius(double r)
    {
        this.radius = r;
    }
    public double getDiameter()
    {
        return 2*this.radius;
    }
    public double getArea()
    {
        return(2*Math.PI*this.radius*this.radius);
    }
    public double getPerimeter()
    {
        return 2*Math.PI* this.radius;
    }
}