
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac{
    public static void main(String args[])
    {
        int size = 5;
        int array1[] = new int[size];//Empty 
        int array2[] = {2,4,6,8,10};
        int array3[] = {3,2,5,1,6,100};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

         for(int i = 0;i<array1.length;i++)
        // {
        //     array1[i] = in.nextInt();
        // }
        // printArray(array1,size);
        // printArray(array2, size);
        // IncrementArray(array2,size);
        // printArray(array2, size);
        // System.out.println("Size in main = " + size);//?

      //  SumAvg(array2,size);

        printArray(array3,size);
        Arrays.sort(array3);
        printArray(array3,size);
    
        
    }
    public static void printArray(int arr[],int size)
    {
    for(int i = 0;i<size;i++)
        { 
            System.out.println("index:" + i + "Value = " + arr[i]);
        }
    }

    public static void IncrementArray(int a[], int s)
    {
        for(int i = 0;i<s;i++)
        { 
            a[i] = a[i] + 1;
        }
        s++;
        System.out.println("S in method = " + s);//?
    }
    public static void SumAvg(int arr[], int size)
    {
        int sum = 0;
        for(int i=0; i<size; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/size));
    }
    

}