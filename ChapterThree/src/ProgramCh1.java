import javax.swing.text.StyledEditorKit;

/**
 * Created by Matthew on 1/17/2017.
 */
public class ProgramCh1
{
    private String name;
    private String idNum;
    private String depart;
    private String pos;

    public static void main(String[] args)
    {
        ProgramCh1 dis = new ProgramCh1();
        String name,idNumber,Department,Position;
        dis.setName("Susan Meyers\nMark Jones\nJoyRogers\t");
        dis.setIdNum(47899 + "\n" + 39119 + "\n" + 81774);




        System.out.println("Name\t\t\t\tID Number\t\t\t\tDepartment\t\t\tPosition");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println( "%,%,");



    }

    public void setName(String nam)
    {
      name = nam;
    }
    public String getName()
    {
        return name;
    }
    public void setIdNum(String id){ idNum = id; }
    public String getIdNum(){ return idNum;}


}
