/**
 * Created by Matthew on 2/8/2017.
 */
public class ChSixEx6
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

    public ChSixEx6(String name, String position, String department, int idNumber)
    {
        this.name = name;
        this.position = position;
        this.department = department;
        this.idNumber = idNumber;
    }

    public ChSixEx6(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.position = "";
        this.department = "";

    }
    public ChSixEx6()
    {
        this.name = "";
        this.position = "";
        this.department = "";
        this.idNumber = 0;
    }

    @Override
    public String toString()
    {
        return
                "\n\nName: " + name +
                "\nPosition:" + position +
                "\nDepartment: " + department +
                "\nID: " + idNumber ;

    }
}
