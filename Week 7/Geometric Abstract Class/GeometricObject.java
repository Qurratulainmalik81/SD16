import java.util.*;
public abstract class GeometricObject{
    private String Color;
    private Boolean filled;
    private Date dateCreated;

    //Constrcutors
    protected GeometricObject()
    {
        this.Color = null;
        this.filled = null;
    
    }
    protected GeometricObject(String color, Boolean filled)
    {
        this.Color = color;
        this.filled = filled;
    }
        
    public String getColor()
    {
        return this.Color;
    }
    public void setColor(String color)
    {
        this.Color = color;
    }
    public Boolean isFilled()
    {
       return this.filled;
    }
    public void setFilled(Boolean filled)
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public String toString()
    {
        return ("Color = " + this.Color + " and its filled = " + this.filled + " created on:" + this.dateCreated);
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}