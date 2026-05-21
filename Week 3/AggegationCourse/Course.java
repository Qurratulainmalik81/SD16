public class Course{
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor instr, TextBook text)
    {
        this.courseName = name;
        this.instructor = instr;
        this.textBook = text;
    }
    public String getName()
    {
        return this.courseName;
    }
    public Instructor getInstructor()
    {
        return this.instructor;
    }
    public TextBook getTextBook()
    {
        return this.textBook;
    }

    public String toString()
    {
        
        return(this.courseName + " is taught by " + this.instructor + " and its textbook is " + this.textBook);
    }
}