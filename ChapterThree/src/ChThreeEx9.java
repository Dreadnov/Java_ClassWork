/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx9
{
    //fields
    private double radius;
    private double diameter;
    private double circumference;
    private double area;
    final double PI = 3.14159;


    //get the requested fields
    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
       return area = PI * (radius * radius);

    }
    public double getDiameter()
    {
       return radius * 2;
    }
    public double getCircumference()
    {
      return   2 * PI * radius;

    }

}
