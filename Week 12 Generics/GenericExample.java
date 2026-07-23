public class GenericExample<T>
{
    private T x;
    public GenericExample()
    {
        this.x = null;
    }
    public GenericExample(T value)
    {
        this.x = value;
    }
    public void setX(T value)
    {
        this.x = value;
    }
    public T getX()
    {
        return this.x;
    }
    public String toString()
    {
        return("X = " + this.x);
    }
}