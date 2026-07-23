import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
      
    }
public static void ReadDB()
{
     ArrayList<Employee> EmpList = new ArrayList<>();
       String query = " SELECT * FROM employee";

       try{
        Connection con = DatabaseConnection.getcon();
        PreparedStatement statement = con.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        while(rs.next())
        {
            Employee temp = new Employee();
            temp.setID((rs.getInt("id")));
            temp.setFirstName(rs.getString("first_name"));
            temp.setLastName(rs.getString("last_name"));
            temp.setSalary(rs.getInt("salary"));
            EmpList.add(temp);

        }
        con.close();
       }
       catch(SQLException e)
       {
        e.printStackTrace();
       }
    System.out.println(EmpList);

}

       public static void WriteDB(){
         ArrayList<Employee> EmpList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int option = 0;
        while(option != -1)
        {
          System.out.println("Enter Employee ID:")  ;
          int id = in.nextInt();
          in.nextLine();
          System.out.println("Enter Employee First Name:")  ;
          String fname = in.nextLine();
          System.out.println("Enter Employee Last Name:")  ;
          String lname = in.nextLine();
          System.out.println("Enter Employee Salary:")  ;
         // double sal = Double.parseDouble(in.nextLine());
          int sal = in.nextInt();
          in.nextLine();
        EmpList.add(new Employee(id, fname, lname, sal));
        System.out.println("Press -1 to exit or any other key to continue:");
        option = in.nextInt();
        in.nextLine();
         }
          String query = " INSERT INTO employee(id,first_name,last_name,salary) " + "Values (?,?,?,?)";

          for(int i = 0;i<EmpList.size();i++)
          {
             try{
            Connection con = DatabaseConnection.getcon();
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,EmpList.get(i).getId());
            statement.setString(2, EmpList.get(i).getFirstName());
            statement.setString(3, EmpList.get(i).getLastName());
            statement.setDouble(4, EmpList.get(i).getSalary());
            int updaterow = statement.executeUpdate();
            System.out.println(updaterow +" rows updated");
         //   statement.execute();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    } 
    }
    public static void WriteSingleRecord()
    {
        Employee E1 = new Employee(2, "Qurratulain","Malik", 150000);
        String query = " INSERT INTO employee(id,first_name,last_name,salary) " + "Values (?,?,?,?)";

        try{
            Connection con = DatabaseConnection.getcon();
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,E1.getId());
            statement.setString(2, E1.getFirstName());
            statement.setString(3, E1.getLastName());
            statement.setDouble(4, E1.getSalary());
            statement.execute();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
}
}
