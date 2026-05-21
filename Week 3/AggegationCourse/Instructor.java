public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String lname, String fname, String office)
    {
        this.firstName = fname;
        this.lastName = lname;
        this.officeNumber = office;
    }
    public Instructor(Instructor ins)
    {
           this.firstName = ins.firstName;
        this.lastName = ins.lastName;
        this.officeNumber = ins.officeNumber;
    }
    public void set(String lname, String fname, String office)
    {
        this.firstName = fname;
        this.lastName = lname;
        this.officeNumber = office;
    }
    public String toString()
    {
        
        return (this.firstName + " " + this.lastName + "(Office:" + this.officeNumber + ")");
    }

    
}
