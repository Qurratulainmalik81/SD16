public class Demo {
    public static void main(String args[])
    {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(2,4);
        MyPoint p3 = new MyPoint(6, 8);
        // System.out.println(p1);
        // System.out.println(p1.distance(4,6));//this = p1 x = 4, y = 6
        // System.out.println(p1.distance(p2));
        // System.out.println(p2.distance());

        MyCircle C1 = new MyCircle();
        System.out.println(C1);
        MyCircle C2 = new MyCircle(6, 8, 4);
        System.out.println(C2);
        MyCircle C3 = new MyCircle(p2, 6);
        System.out.println(C3);

        System.out.println(C2.distance(C3));
        System.out.println(p2.distance(p3));
    




    }
    
}
