public class BagofChips{

    //list of attributes properties data fiels
    String color;
    String shape;
    int size;
    float weight;
    String flavor;
    String brand;

    //beaviors which are methods
    public void opened(int flag)
     {
        if(flag==1)
        System.out.println("Open");
    else
          System.out.println("Closed");
    }
    public void full(int flag)
    {
          if(flag==1)
        System.out.println("Bag is full");
        else if(flag==2)
          System.out.println("Bag is half");
        else if(flag ==0)
        System.out.println("Bag is empty");
    }
    public void display()
    {
        System.out.println("Color = " + this.color + " Flavor = " + this.flavor);
    }

public static void main(String args[])
{
    BagofChips bag1 = new BagofChips();
    bag1.brand = "Lays";
    bag1.flavor = "Dill Pickel";
    BagofChips bagFeras = new BagofChips();
    bagFeras.flavor = "BBQ";

    bag1.display();
    bagFeras.display();
}
}