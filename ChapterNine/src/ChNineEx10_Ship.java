/**
 * Created by Matthew on 2/28/2017.
 */
public class ChNineEx10_Ship
{
    //fields
    String ship ;
    String shipBuilt = "[Ship Created]";

    //getters and setters for their repeated fields
    public String getShip()
    {
        return ship;
    }
    public void setShip(String ship)
    {
        this.ship = ship;
    }
    public String getShipBuilt()
    {
        return shipBuilt;
    }
    public void setShipBuilt(String shipBuilt)
    {
        this.shipBuilt = shipBuilt;
    }


    public ChNineEx10_Ship(String ship, String shipBuilt)
    {
        this.ship = ship;
        this.shipBuilt = shipBuilt;
    }
    //default constructor
    ChNineEx10_Ship()
    {
    }
    //The default to string
    @Override
    public String toString()
    {
        return ship + " " + shipBuilt;
    }
}
