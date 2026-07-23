import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerializationDemo {
    public static void main(String[] args)
    {
        ArrayList<Employee> emp = new ArrayList<>();
        try{
            FileInputStream fin = new FileInputStream("Emp.txt");
            ObjectInputStream ObjectIn = new ObjectInputStream(fin);
            Object temp = null;
            while(true)
            {
                try{
                    temp = ObjectIn.readObject();
                }
                catch(EOFException e)
                {
                    break;
                }
                emp.add((Employee)temp);
            }
            fin.close();
            ObjectIn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
System.out.println(emp);


    //     Employee E1 = new Employee(1, "Sheri","Evangelene", 150000);
    //     Employee E2 = new Employee(2, "Victoria","Smith", 150000);
    //     Employee E3 = new Employee(3, "Morgan","Ings", 150000);
    //     Employee E4 = new Employee(4, "Megan","Hickey", 150000);

    //     try{
    //         FileOutputStream fout = new FileOutputStream("Emp.txt");
    //         ObjectOutputStream ObjectOut = new ObjectOutputStream(fout);
    //         ObjectOut.writeObject(E1);
    //         ObjectOut.writeObject(E2);
    //         ObjectOut.writeObject(E3);
    //         ObjectOut.writeObject(E4);
    //         fout.close();
    //         ObjectOut.close();
    //     }
    //     catch(IOException e)
    //     {
    //         e.printStackTrace();
    //     }
         System.out.println("Success");

    }
    
}
