public interface AnimalInt {
    //cannot have instant variables or non static data
    //can only have constants
    //you cannot have constrcutors
    //you cannot instatiate your interfaces
    double g = 10.0;
   // public static final double pi = 3.14;
  //  double pi = 3.14;

  //interfaces have abstract methods
  void sleep();
  public abstract void movable();

  default void breath()
  {
    System.out.println("Breath in Oxygen");
  }
    
}
