/**
 * Created by Matthew on 2/8/2017.
 */
public class ChTenEx5
{
    private double hourlyPayRate,hoursWorked,grossPay;
    private int idNumber;
    String name;

    //the getter and setters and their respected fields.
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getGrossPay()
    {
        return grossPay;
    }
    public void setGrossPay(double grossPay)
    {
        this.grossPay = grossPay;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    //constructor that will check the name ,hoursWorked,idNumber and hourlyPayRate to their respected errors
    public ChTenEx5(String name,double hoursWorked, int idNumber,double hourlyPayRate)
    {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.idNumber = idNumber;
        this.hourlyPayRate = hourlyPayRate;
        // specified try statement that will trigger the catch exception if incorrect
        try
        {
            if (name.equals("")) {throw new ChTenEx5_PayrollClassException();}
            if (idNumber < 1) {throw new ChTenEx5_Invalid_Id();}
            if (hourlyPayRate > 25 || hourlyPayRate <= 0) {throw new ChTenEx5_Invalid_HourlyPayRate();}
            if (hoursWorked < 0 || hoursWorked > 84){throw new ChTenEx5_Invalid_HoursWorked();}
        } catch (ChTenEx5_Invalid_HoursWorked v)
        {
            v.printStackTrace();
        } catch (ChTenEx5_PayrollClassException e)
        {
            e.printStackTrace();
        } catch (ChTenEx5_Invalid_HourlyPayRate x)
        {
            x.printStackTrace();
        } catch (ChTenEx5_Invalid_Id z)
        {
            z.printStackTrace();
        }

    }



    //to string to display the end result
    @Override
    public String toString()
    {
        return
                "\n\nName: " + name +
                "\nHours Worked: " + hoursWorked +
                "\nHourly PayRate: " + hourlyPayRate +
                "\nID: " + idNumber ;

    }
}
