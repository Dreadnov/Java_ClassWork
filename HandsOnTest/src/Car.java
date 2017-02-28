/**
 * Created by Matthew on 2/27/2017.
 */
public class Car extends Automobile implements Move
{
    public Car(String vachelType)
    {
        System.out.print("\nA new " + vachelType +" has been created!\n");
    }

    public Car()
    {
        System.out.print("\nA new Car has been created!\n");
    }

    @Override
    public void addFuel(double numberOfGallons)
    {

    }


    @Override
    public Move moveVehicle()
    {
        System.out.print("There is no car");
        return null;
    }
}
