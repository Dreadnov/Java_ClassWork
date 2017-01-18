/**
 * Created by Matthew on 1/17/2017.
 */
public class Test
{

    private double length;
    private double width;
    private double num;
    public static void main(String[] args)
    {
        Test ex = new Test();

        ex.setLength(10.0);
        ex.setWidth(15.0);

        System.out.println("The box length is " + ex.getLength());
        System.out.println("The box width is " + ex.getWidth());
        System.out.println("The box area is " + ex.getLength() * ex.getLength());
    }


    public void setLength(double len)
    {
        length = len;
    }
    public void setWidth(double wid)
    {
        width = wid;
    }
    public double getLength()
    {
        return  length;
    }
    public double getWidth()
    {
        return  width;
    }


}
