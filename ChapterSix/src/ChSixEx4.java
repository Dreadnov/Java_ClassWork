/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx4
{
    double length,width;//


    //getters and setters for the length and width
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }

    //calculates the area for the users input
    public double getArea()
    {
        return this.getLength() * this.getWidth();
    }

    //enables the use of
    public ChSixEx4(double len, double w)
    {
        this.setWidth(len);
        this.setLength(w);
    }


        @Override public boolean equals(Object o)//enables the boolean comparison
        {
            if (o == null || getClass() != o.getClass()) return false;
            ChSixEx4 that = (ChSixEx4) o;
            if (this.getArea() == ((ChSixEx4) o).getArea()) return true;
            if (Double.compare(that.getArea(), this.getArea()) != 0) return false;
            return true;
        }

    //overrides the output and will display what is inside of the to String method in addition to the other statement
    @Override public String toString()
    {
        return "Area: " + String.format("%.2f",getArea());
    }
}
