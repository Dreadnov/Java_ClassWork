/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx2
{

    private String description;
    private int units;

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getUnits()
    {
        return units;
    }
    public void setUnits(int units)
    {
        this.units = units;
    }

     ChSixEx2()
    {
    }

    ChSixEx2(ChSixEx2 o)
    {
        this.setDescription(o.getDescription());
        this.setUnits(o.getUnits());
    }

    @Override
    public String toString()
    {
        return "Item Description: " + this.getDescription() +
                "\nCurrent units in stock: " + this.getUnits() + "\n";
    }
}
