/**
 * Created by Matthew on 2/13/2017.
 */
public class HotEx6Launcher
{
    public static void main(String[] args)
    {
        Book dis = new Book("Java2015","1996","Mr.Cancer");
        library  vin = new library(dis);
        System.out.println(vin.toString());
        System.out.println(dis.toString());



    }
}
