/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx1_Employee
{
    //Fields
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    //method that retrieves the users name
    public String getEmployeeName()
    {
        return employeeName;
    }
    //getters and setters
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

    // arg-Constructor with the parameters name number and startDate
    public ChNineEx1_Employee(String name, String number, String startDate)
    {
        this.employeeName = name;
        this.employeeNumber = number;
        this.hireDate = startDate;
    }
    //default constructor
    public ChNineEx1_Employee()
    {

    }

    //Overrides the output for the final outcome
    @Override
    public String toString()
    {
        return "\nEmployee Name: " + employeeName +
                "\nEmployee Number: " + employeeNumber +
                "\nEmployee Start Date: " + hireDate;
    }
}
