import java.io.*;

/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx6_FieldArray
{

    //the method that passes the name of the file and the array throws the IOException
    public static void writeArray(String fileName, int[] num) throws IOException
    {
        //opens the file and write to it and then closes the file
        try
        {
            FileOutputStream fileData = new FileOutputStream(fileName);
            DataOutputStream dataoutputFile = new DataOutputStream(fileData);

            try
            {
                System.out.print("Writing to file.....");
                for (int i = 0; i < num.length; i++)
                {
                    dataoutputFile.writeInt(num[i]);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                dataoutputFile.close();
                fileData.close();
                System.out.print("File close");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    //opens the file and reads the file and inputs the array as text into the array then closes the file
    public static void readArray(String fileName, int[] num) throws IOException
    {
        //opens the file and write to it and then closes the file
        try
        {
            FileInputStream fileData = new FileInputStream(fileName);
            DataInputStream dataoutputFile = new DataInputStream(fileData);

            try
            {
                System.out.print("Writing to file.....");
                for (int i = 0; i < num.length; i++)
                {
                    System.out.println(dataoutputFile.readInt());
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                dataoutputFile.close();
                fileData.close();
                System.out.print("File closed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
