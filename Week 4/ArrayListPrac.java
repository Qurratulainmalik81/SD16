import java.util.ArrayList;
public class ArrayListPrac {
    public static void main(String args[])
    {
        ArrayList<String> arraList1 = new ArrayList<>(10);
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Person> ListPerson = new ArrayList<>();

        Person p1 = new Person("Victoria", "Smith");
        ListPerson.add(p1);
        ListPerson.add(new Person("Sam", "Higdon"));

        arraList1.add("Ainee");
        System.out.println(arraList1.size());
        System.out.println(arraList1);
        arraList1.add("Sheri");
        System.out.println(arraList1.size());
        System.out.println(arraList1);
        arraList1.add(1,"Megan");
        System.out.println(arraList1.size());
        System.out.println(arraList1);

        //write a code using contains method to check if Morgan is present in the list
        Boolean hasMorgan = arraList1.contains("Morgan");
        if(hasMorgan==true)
        System.out.println(" Has it");
    else
         System.out.println("Doesnt Have it");

        for(int i = 0;i<arraList1.size();i++)
        {
            System.out.println(arraList1.get(i));
        }
        List2.add(10);
        List2.add(20);
        List2.add(30);
        for(int i = 0;i<List2.size();i++)
        {
            System.out.println(List2.get(i)*10);
        }



    }
    
}
