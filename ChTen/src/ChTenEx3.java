/**
 * Created by Matthew on 1/20/2017.
 */
public class ChTenEx3
{
    //fields
    private String description;
    private int unitsOnHand;
    private double price;

    //getters and setters for the respected fields
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public int getUnitsOnHand()
    {
        return unitsOnHand;
    }
    public void setUnitsOnHand(int unitsOnHand)
    {
        this.unitsOnHand = unitsOnHand;
    }
    public double getPrice()
    {
        return price;
    }
    //try and ccatech to check if the following fields are incorrect and throws the exception
    public double setPrice(double price)
    {
        try{
            this.price = price;
            if (price < 0) throw new ChTenEx3_NagetivePriceException();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        this.price = price;
        return price;
    }


}
