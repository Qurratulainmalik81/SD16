
public class StringPrac{
    public static void main(String args[])
    {
       
      //  String s2 = new String("Welcome to java");
        String s1 = "Welcome";
        String s2 = new String("Welcome to java");
        	
//   if (s1.equals(s2)){  
//     System.out.println("Equals is true");
//   }
 
//   if (s1 == s2) {
//     System.out.println("== is true");
//   }

if (s1.compareTo(s2) > 0) {  
    System.out.println("s1 is greater");
  }
  else if (s1.compareTo(s2) == 0) { 
    System.out.println("they are equal");
  }
  else 
     System.out.println("s2 is greater");
    }
}