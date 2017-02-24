/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx1_Employee
{
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate()
    {
        return hireDate;
    }
    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }

    public ChNineEx1_Employee(String name, String number, String startDate)
    {
        this.employeeName = name;
        this.employeeNumber = number;
        this.hireDate = startDate;
    }

    public ChNineEx1_Employee()
    {

    }

    @Override
    public String toString()
    {
        return "\nEmployee Name: " + employeeName +
                "\nEmployee Number: " + employeeNumber +
                "\nEmployee Start Date: " + hireDate;
    }
}
