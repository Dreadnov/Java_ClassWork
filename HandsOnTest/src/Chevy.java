/**
 * Created by Matthew on 2/27/2017.
 */
public class Chevy extends Car
{

    public Chevy(String vachelType)
    {
        super(vachelType);
        vachelType = "Chevy";
    }

    @Override
    public Move moveVehicle()
    {
        System.out.print("\nThe Chevy is moving.\n");
        return null;
    }
}
