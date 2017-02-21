/**
 * Created by Matthew on 2/15/2017.
 */
public class ChSevenEx2_PayrollClass
{
    private int[] employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wage = new double[7];


    //getters and setters
    public int[] getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(int[] employeeId)
    {
        this.employeeId = employeeId;
    }

    public int[] getHours()
    {
        return hours;
    }
    public void setHours(int hours, int i)
    {
        this.hours[i] = hours;
    }

    public double[] getPayRate()
    {
        return payRate;
    }
    public void setPayRate(double payRate , int i)
    {
        this.payRate[i] = payRate;
    }

    public double[] getWage()
    {
        return wage ;
    }
    public void setWage(double[] wage)
    {
        this.wage = wage;
    }
    public void setWage(double wage, int index)
    {
        this.wage[index] = wage;
    }

    // evaluates the gross pay for the equation
    public double getGrossPay(int idNum)
    {
        double pay = 0.0;
        for (int i = 0; i < this.employeeId.length ; i++)
        {
            //if the numbers are equal ,multiply the rate times the hours worked
            if (this.employeeId[i] == idNum)
            {
             pay = this.payRate[i] * (double)this.hours[i];
             break;
            }
        }
        return pay ;
    }
    //blank public constructor
    public ChSevenEx2_PayrollClass()
    {

    }
}
