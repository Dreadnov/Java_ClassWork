/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx1_ProductionWorker extends ChNineEx1_Employee
{
    private int shift;
    private double hourlyPayRate;

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

    public ChNineEx1_ProductionWorker(String name, String number, String startDate, int shift, double hourlyPayRate)
    {
        super(name, number, startDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }
    public ChNineEx1_ProductionWorker()
    {
    }

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