/**
 * Created by Matthew on 2/28/2017.
 */
public class ChNineEx10_CargoShip extends ChNineEx10_Ship
{
    //fields
    int cargoHold;

    //calls the baseClass constructor and uses the current fields : cargoHold
    public ChNineEx10_CargoShip(String ship, String shipBuilt, int cargoHold)
    {
        super(ship, shipBuilt);
        this.cargoHold = cargoHold;
    }
    //default  constructor
     ChNineEx10_CargoShip()
    {
    }
    //override the base classes toString
    @Override
    public String toString()
    {
        return "The cargo ship " + ship + " can hold " + cargoHold  + " tons.";
    }
}
