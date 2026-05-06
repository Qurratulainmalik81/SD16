
import java.util.Scanner;

public class WelcomeJava{
    public static void main(String args[])
    {
        int i = 10;
        float f = 5.5f;
        char c = 'A';
        int x,y,z;
      //  x  = 10;
      //  y = 20;
        

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        x = in.nextInt();
        System.out.println("Enter Second Integer: ");
        y = in.nextInt();
        z = x + y;
        System.out.println("X + Y = " + z);
        System.out.println("Hello World");
    }

}