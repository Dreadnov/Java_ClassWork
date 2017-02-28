/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx2_ShiftSupervisor extends ChNineEx1_Employee
{
    //fields
    private double annualSalary;
    private double annualProductionBonus;

    //getters and setters for the respected fields
    public double getAnnualSalary()
    {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }
    public double getAnnualProductionBonus()
    {
        return annualProductionBonus;
    }
    public void setAnnualProductionBonus(double annualProductionBonus) {this.annualProductionBonus = annualProductionBonus;}

    // constructor that calls the ChNineEx1_Employee super and add the annualSalary and annualProductionBonus
    public ChNineEx2_ShiftSupervisor(String name, String number, String startDate, double annualSalary, double annualProductionBonus)
    {
        super(name, number, startDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }
    //default constructor
    public ChNineEx2_ShiftSupervisor()
    {

    }
    //overrides the display outcome
    @Override
    public String toString()
    {
        return "\nEmployee Name: " + getEmployeeName() +
                "\nEmployee Number: " + getEmployeeNumber() +
                "\nEmployee Start Date: " + getHireDate() +
                "\nAnnual Salary: " + String.format("$%,.2f", annualSalary) +
                "\nAnnual Production Bonus: " + String.format("$%,.2f", annualProductionBonus) +
                "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    }
}
