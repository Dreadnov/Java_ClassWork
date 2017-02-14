/**
 * Created by Matthew on 2/7/2017.
 */
// This class will represent the room carpet class
public class ChSixEx3
{
    private ChSixEx3_2 size;
    private double carpetCost;
    //mutators and accessors


    public ChSixEx3_2 getSize()
    {
        return size;
    }
    public void setSize(ChSixEx3_2 size)
    {
        this.size = size;
    }

    public double getCarpetCost()
    {
        return carpetCost;
    }
    public void setCarpetCost(double carpetCost)
    {
        this.carpetCost = carpetCost;
    }

    public ChSixEx3(ChSixEx3_2 dim, double cost)
    {
        this.setSize(dim);
        this.setCarpetCost(cost);
    }

    public double getTotalCost()
    {
        return getSize().getArea() * getCarpetCost();
    }

    @Override
    public String toString()
    {
        return "Total Cost: "+ String.format("$%.2f", getTotalCost()) ;
    }
}
