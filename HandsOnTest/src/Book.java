/**
 * Created by Matthew on 2/13/2017.
 */
public class Book
{
    private String name,publishDate,author;

    public Book(String ame,String ublishDate, String uthor)
    {
        name = ame;
        publishDate = ublishDate;
        author = uthor;
    }
    public Book(Book object2)
    {
        name = object2.name;
        publishDate = object2.publishDate;
        author = object2.author;
    }

    public void set(String ame,String ublishDate, String uthor)
    {
        name = ame;
        publishDate = ublishDate;
        author = uthor;
    }

    @Override
    public String toString()
    {
        String str =
                "Name:" + name + '\'' +
                "\npublishDate:" + publishDate + '\'' +
                "\nAuthor: " + author;
        return str;
    }
}
