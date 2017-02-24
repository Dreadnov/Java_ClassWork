/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx2_ShiftSupervisor extends ChNineEx1_Employee
{
    private double annualSalary;
    private double annualProductionBonus;

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


    public ChNineEx2_ShiftSupervisor(String name, String number, String startDate, double annualSalary, double annualProductionBonus)
    {
        super(name, number, startDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public ChNineEx2_ShiftSupervisor()
    {

    }

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
