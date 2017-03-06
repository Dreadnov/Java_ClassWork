import java.io.File;

/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx7_8_Launcher
{
    public static void main(String[] args)
    {
        //creates the file and specifies its name
        File fileName = new File("Ex7.dat");
        //specifies the string that the file will hold
        String neatStr = "The following is Spooky\n";
        //passes the file name and the corresponding string
        ChTenEx7_8_FileMethod.writeSecret(fileName.getName(), neatStr);
        //passes the following to be encrypted within the file
        ChTenEx7_8_FileMethod.readSecret(fileName.getName(), neatStr);
        System.out.print("The following is no longer spooky.");

    }
}
