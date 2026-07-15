class ExceptionDemo
{ 
  static void checkEligibilty(int stuage, int stuweight) throws ArithmeticException
  { 
      if(stuage<12 && stuweight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Entries Valid!!"); 
      }
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     try{
     checkEligibilty(10, 39); 
   }
   catch(ArithmeticException e)
   {
      System.out.println(e.getMessage());
   }
   System.out.println("Have a nice day.."); 
 } 

}
