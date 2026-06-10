public class Person {
    private String fName;
    private String lName;
    public Person(String fn, String ln)
    {
        this.fName = fn;
        this.lName = ln;
    }
    public String toString()
    {
        return (this.fName + " " + this.lName);
    }
    
}
