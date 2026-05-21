public class TextBook{
    private String title;
    private String author;
    private String publisher;

    public TextBook(String title, String author, String publisher)
    {
        this.author = author;
        this.publisher = publisher;
        this.title = title;
    }
    
    public TextBook(TextBook object2)
    {
        this.author = object2.author;
        this.publisher = object2.publisher;
        this.title = object2.title;
    }
        public void set(String title, String author, String publisher)
    {
        this.author = author;
        this.publisher = publisher;
        this.title = title;
    }
    public String toString()
    {
        return(this.title + " Written by " + this.author + " and Publisher:" + this.publisher);
    }


}