//1. Abstract is a non access modifier and abstract class cannot be instantiated
//2. need to extend your abstract classes to use them
//3. Abstract class can have constructor
//4. can have instant variables
//5. Abstract classes may or may not have abstract methods
//6. Abstract can have instance methods
public abstract class Animal{
    private String name;
    Animal()
    {
        this.name = null;
    }
    Animal(String name)
    {
        this.name =name;
    }
    public abstract void greet();
    public abstract void eat();

    public void display()
    {
        System.out.println("Name = " + this.name);
    }


}