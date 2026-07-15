
import java.io.*;
public class FileDemo{
    public static void main(String[] args)
    {
        //  File file;
        //File Class Example
        // try{
        //     File file = new File("C:\\Users\\qurra\\Desktop\\SD16\\Week 11\\FirstJava.txt");
        //     if(file.createNewFile())
        //         System.out.println("New File created");
        //     else
        //      System.out.println("File already exist");
        //     System.out.println(file.getAbsolutePath());
        // }
        // catch(IOException e)
        // {
        //     e.printStackTrace();
        // }

        //FileWriter class to create text files

    //     try{
    //         File file = new File("C:\\Users\\qurra\\Desktop\\SD16\\Week 11\\FirstJava.txt");
    //         FileWriter fw = new FileWriter(file,true);
    //         fw.write("My name is Qurratulain");
    //         fw.close();
    //     }
    //   catch(IOException e)
    //     {
    //         e.printStackTrace();
    //     }  
    //     System.out.println("Success");

    //  try{
    //     FileReader fr = new FileReader("C:\\Users\\qurra\\Desktop\\SD16\\Week 11\\FirstJava.txt");
    //     int i;
    //     while((i=fr.read())!=-1)
    //     {
    //         System.out.print((char)i);
    //     }
    //     fr.close();
    //     }
    //   catch(IOException e)
    //     {
    //         e.printStackTrace();
    //     }  
    //     System.out.println("Success");

    //FileOutputStream to write binary files
    //  try{
    //     FileOutputStream fout = new FileOutputStream("C:\\Users\\qurra\\Desktop\\SD16\\Week 11\\Hello.txt");
    //    String s = "Hello, how ya'll doing";
    //     byte b[]= s.getBytes();
    //     fout.write(b);
    //     fout.close();

    //     }
    //   catch(IOException e)
    //     {
    //         e.printStackTrace();
    //     }  
    //     System.out.println("Success");

    //FileInputStream
    try{
        FileInputStream fin = new FileInputStream("C:\\Users\\qurra\\Desktop\\SD16\\Week 11\\FirstJava.txt");
        int i;
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }
        fin.close();
        }
      catch(IOException e)
        {
            e.printStackTrace();
        }  
        System.out.println("Success");

    }
}