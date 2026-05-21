public class MyPoint{
    private int x;
    private int y;

    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setY(int y)
    {
        this.y = y;

    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y; 
    }

    public String toString()
    {
        return ("(" + this.x + "," + this.y+")");
    }
    public double distance(int x, int y)
    {
        //this = p1 //for line 8
        int xdiff = this.x - x;
        int ydiff = this.y - y;
         return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
        

    }
      public double distance(MyPoint p)
    {
         int xdiff = this.x - p.x;
        int ydiff = this.y - p.y;
         return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
        
    }
   public double distance()
    {
         int xdiff = this.x - 0;
        int ydiff = this.y - 0;
        return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
        

    }
}
