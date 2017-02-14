/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx12_Odometer
{
    private  double mileage = 0.0;//field for millage
    private ChSixEx12_FuelGauge  useage;//enables the new object

    public double getMileage()
    {
        return mileage;
    }//gets the mileage
    public void setMileage(double mileage)
    {
        this.mileage = mileage;
    }//sets the mileage

    public double getAddMile()//adds 1 mile to the odometer and resets it when it gets to all nines
    {
        if (mileage > 999999)
        {
            mileage = 0.0;
        }
        else
        {
            mileage++;
        }
        return mileage;
    }

    public void getBurn()// burns the gas
    {
        if ((mileage % 24.0) == 0.0)
        {
            double totalBurn;
            totalBurn = useage.getFuel() - 1.0;
            useage.setFuel(totalBurn);
        }
    }

    public ChSixEx12_Odometer()
    {

    }

    public ChSixEx12_Odometer(ChSixEx12_FuelGauge useage)
    {
        this.useage = useage;
    }//constructed that grabs that allows the fuel gage to be used
}
