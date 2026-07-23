public class GenericRectangle<E,U> {
    private E length;
    private U width;
    public GenericRectangle()
    {
        this.length = null;
        this.width = null;
    }
     public GenericRectangle(E length, U width)
    {
        this.length = length;
        this.width = width;
    }
    public E getLength()
    {
        return this.length;
    }
    public void setlength(E length)
    {
        this.length = length;
    }
    public U getWidth()
    {
        return this.width;
    }
    public void setWidth(U width)
    {
        this.width = width;
    }
    public String toString()
    {
        return ("Length = " + this.length + " and width = " + this.width);
    }

    public<T> void display(T x, E y, U z)
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }


}
