/**
 * Created by Matthew on 1/17/2017.
 */
public class ChThreeEx1
{

    public static void main(String[] args)
    {
        Employee Susan = new Employee();
        Susan.setName("Susan Meyers");
        Susan.setIdNumber(47899);
        Susan.setDepartment("Accounting");
        Susan.setPosition("Vice President");

        Employee Mark = new Employee();
        Mark.setName("Mark Jones");
        Mark.setIdNumber(39119);
        Mark.setDepartment("IT");
        Mark.setPosition("Programmer");

        //sets the fields for the current fields
        Employee Joy = new Employee();
        Joy.setName("Joy Rogers");
        Joy.setIdNumber(81774);
        Joy.setDepartment("Manufacturing");
        Joy.setPosition("Engineer");

        //this displays the outcome specified in the book
        System.out.println("Name \t\t\t" + " ID Number \t" + "Department \t\t" + " Position");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(Susan.getName() + "\t\t " + Susan.getIdNumber() + " \t\t" + Susan.getDepartment() + "\t\t " + Susan.getPosition());
        System.out.println(Mark.getName() + "\t\t " + Mark.getIdNumber() + " \t\t" + Mark.getDepartment() + "\t\t\t\t " + Mark.getPosition());
        System.out.println(Joy.getName() + "\t\t " + Joy.getIdNumber() + " \t\t" + Joy.getDepartment() + "\t\t " + Joy.getPosition());

    }
}
class Employee
{
    String name,position,department;
    int idNumber;

    //The gets and sets will fill the variables above
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getPosition()
    {
        return position;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public int getIdNumber()
    {
        return idNumber;
    }
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }



}