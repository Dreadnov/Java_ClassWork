/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx12_FuelGauge
{
    private  double fuel = 0.0;//field for fuel


    public double getFuel()
    {
        return fuel;
    }//get the current fuel

    public void setFuel(double fuel)
    {
        this.fuel = fuel;
    }//sets the fuel filed

    public ChSixEx12_FuelGauge()//default constructor
    {

    }

    public  double getFilledUp()//adds 1 gallon of gas to the tank
    {
        if(fuel < 15.0)
        {
            ++fuel;
        }
        return fuel;
    }

    public double getFuleLoss()// takes away 1 gallon of gat from the total amount of gas
    {
        if(fuel > 0.0)
        {
            fuel--;
        }
        return fuel;
    }
}
