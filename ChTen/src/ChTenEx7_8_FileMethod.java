import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx7_8_FileMethod
{
    //the method that passes the name of the file and the string that is specified
    public static void writeSecret(String fileName, String msg)
    {
        //opens the file is opened written to and then closed
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            try{

                System.out.println("Writing to file...");
                for(char ch : msg.toCharArray())
                {
                    dataOutputStream.writeChar(ch + 1);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                dataOutputStream.close();
                fileOutputStream.close();
                System.out.println("File closed!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    //passes the file name and the current message that it holds
    public static void readSecret(String fileName, String msg)
    {
        //the try catch statement opens the file encrypts it and then closes the files
        try
        {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            try
            {
                for(char ch : msg.toCharArray())
                {
                    System.out.print(Character.toChars(dataInputStream.readChar() - 1));
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                dataInputStream.close();
                fileInputStream.close();
                System.out.println("\nFile closed!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}