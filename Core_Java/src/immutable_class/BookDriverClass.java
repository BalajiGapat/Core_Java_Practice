package immutable_class;

final class Book 
{
    private final String title;
    private final String author;

//    public Book()
//    {
//		this.title = "";
//		this.author = "";	
//    }
    
    
    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }
    

    // No setters to modify title and author.

	@Override
	public String toString() 
	{
		return "Book [title=" + title + ", author=" + author + "]";
	}


}



public class BookDriverClass 
{
	public static void main(String[] args)
	{
		Book b1=new Book("Java", "James Gosling");
		System.out.println(b1);
	}
}
