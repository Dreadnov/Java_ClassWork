/**
 * Created by Matthew on 2/28/2017.
 */
public class ChNineEx10_CruiseShip extends ChNineEx10_Ship
{
    //fields
    int maxNumberOfPassengers;

    //calls the baseClass constructor and uses the current fields : maxNumberOfPassengers
    public ChNineEx10_CruiseShip(String ship, String shipBuilt, int maxNumberOfPassengers)
    {
        super(ship, shipBuilt);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }
    //default constructor
    ChNineEx10_CruiseShip()
    {
    }
    //override the base classes toString
    @Override
    public String toString()
    {
        return  "The " + ship + " holds " + maxNumberOfPassengers + " passengers.";

    }
}
