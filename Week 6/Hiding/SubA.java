 public class SubA extends A {
      static void f() { // static methods are not overridden
          System.out.println("Hide.f");
      }
      void g() {
          System.out.println("Hide.g");
      }
      public static void main(String args[]) {
          A aref = new SubA();
          // call A.f()
          aref.f();
          // call SubA.g()
          aref.g();
      }
  }
