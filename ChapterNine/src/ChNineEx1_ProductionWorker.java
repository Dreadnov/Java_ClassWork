/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx1_ProductionWorker extends ChNineEx1_Employee
{
    //Fields
    private int shift;
    private double hourlyPayRate;

    //Getters and setters for their respected fields
    public int getShift()
    {
        return shift;
    }
    public void setShift(int shift)
    {
        this.shift = shift;
    }
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    // args-constructor that holds name, number, start date , shift, and hourly pay
    public ChNineEx1_ProductionWorker(String name, String number, String startDate, int shift, double hourlyPayRate)
    {
        super(name, number, startDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }
    //default constructor
    public ChNineEx1_ProductionWorker()
    {
    }

    //overrides the final output and display
    @Override
    public String toString()
    {
        return "\nEmployee Name: " + getEmployeeName() +
                "\nEmployee Number: " + getEmployeeNumber() +
                "\nEmployee Start Date: " + getHireDate() +
                "\nHourly Pay Rate: " + String.format("$%,.2f", hourlyPayRate) +
                "\nShift: " + getShift() +
                "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    }
}