public class CircleDemo{
    public static void main(String args[])
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4.0);

        System.out.println("Area Circle 1 = " + c1.getArea());//3.14
        System.out.println("Area Circle 2 = " + c2.getArea());//3.14*4*4
    }

}