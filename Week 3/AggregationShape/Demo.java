public class Demo {
    public static void main(String args[])
    {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2,4);
        System.out.println(p1);
        System.out.println(p1.distance(4,6));//this = p1 x = 4, y = 6
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance());


    }
    
}
