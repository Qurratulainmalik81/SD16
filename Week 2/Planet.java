class Planet
{	
	public double radius;
	public String name;
	public static final long g = 10;

    //no argument constrcutor
    public Planet()
    {
        this.radius= 5.0;
        this.name = null;
    }
    //Parameterized construtor
    public Planet(String n, double radius)
    {
        this.name = n;
        this.radius = radius;
    }
      public Planet(String n)
    {
        this.name = n;
        this.radius = 0.0;
    }
      public Planet(double radius)
    {
        this.name = null;
        this.radius = radius;
    }

	public void display()
	{
		System.out.println("Radius "+ radius);//10
		System.out.println("Name " + name);//Dunya
		System.out.println("Long "+ g);	//10					
	}
	public void initialize()
	{
		radius = 10;	//usage
		name = "Dunya";	//usage	
	}
	public static void main(String [] args)		
	{
		Planet p = new Planet("Earth", 78.0); // creation
        p.display();
		// p. initialize();		//usage
		// p.display();		//usage
        // Planet p2 = new Planet(); // creation
        // p2.display();
		// p2.initialize();		//usage
		// p2.display();		//usage
	}
}
