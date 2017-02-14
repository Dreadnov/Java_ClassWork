import java.text.DecimalFormat;
/**
 * Created by Matthew on 2/8/2017.
 */
public class ChSixEx7
{
    private String description;
    private int itemNumber;
    private CostData cost;

    public ChSixEx7(String desc, int itemNum, double wholesale, double retail)
    {
        this.description = desc;
        this.itemNumber = itemNum;
        cost = new CostData();
        cost.setRetail(retail);
        cost.setWholesale(wholesale);
    }

    private class  CostData
    {
        public double wholesale, retail;

        public double getWholesale()
        {
            return wholesale;
        }
        public void setWholesale(double wholesale)
        {
            this.wholesale = wholesale;
        }

        public double getRetail()
        {
            return retail;
        }
        public void setRetail(double retail)
        {
            this.retail = retail;
        }

        public CostData()
        {
        }
    }

   @Override public  String toString()
    {
        String str;

        str =   "Description: " + description +
                "\nItem Number: " + itemNumber +
                "\nWholesale Cost: $" + String.format("%,.2f", cost.wholesale) +
                "\nRetail Price: $" + String.format("%,.2f", cost.retail) ;
        return str;
    }
}