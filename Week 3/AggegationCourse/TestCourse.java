public class TestCourse {
    public static void main(String args[])
    {
        Instructor  JavaIns  = new Instructor("Malik", "Qurratulain", "None");
        Instructor  PythonIst  = new Instructor("Smith", "Victoria", "G201");
        System.out.println(JavaIns.toString());
         System.out.println(PythonIst.toString());
         
        TextBook JavaBook = new TextBook("How to Program early objects","Dietel" ,"Pearson");

        Course java = new Course("Advanced Programming", JavaIns, JavaBook);
        System.out.println(java.toString());

    }
}
