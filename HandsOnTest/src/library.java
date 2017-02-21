/**
 * Created by Matthew on 2/13/2017.
 */
public class library
{
    private Book book;
    private String name;

    public Book getBook()
    {
        return new Book(book);
    }
    public void setBook(Book book)
    {
        this.book = book;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public library(Book book/*, String name*/)
    {
        this.book = new Book(book);
        //this.name = name;
    }

    @Override
    public String toString()
    {
        String str;
        str = "" + book;
        return str;

    }
}
