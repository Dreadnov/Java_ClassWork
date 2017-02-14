/**
 * Created by Matthew on 2/8/2017.
 */
public class ChSixEx8_RetailItem
{
    private String description;
    private int itemNumber;
    private CostData cost;

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getItemNumber()
    {
        return itemNumber;
    }
    public void setItemNumber(int itemNumber)
    {
        this.itemNumber = itemNumber;
    }

    public CostData getCost()
    {
        return cost;
    }
    public void setCost(CostData cost)
    {
        this.cost = cost;
    }

    public double getWholesale()
    {
        return this.getCost().getWholesale();
    }
    public void setWholesale(double wholesale)
    {
        this.setWholesale(wholesale);
    }

    public double getRetail()
    {
        return this.getCost().getRetail();
    }
    public void setRetail(double retail)
    {
        this.setRetail(retail);
    }

    public ChSixEx8_RetailItem(String desc, int itemNum, double wholesale, double retail)
    {
        this.description = desc;
        this.itemNumber = itemNum;
        cost = new CostData();
        cost.setWholesale(wholesale);
        cost.setRetail(retail);
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

}
