/**
 * Created by Matthew on 2/27/2017.
 */
public class Toyota extends Car
{

    public Toyota(String vachelType)
    {
        super(vachelType);
        vachelType = "Toyota";
    }

    @Override
    public Move moveVehicle()
    {
        System.out.print("\nThe Toyota is moving\n");
        return null;
    }
}
