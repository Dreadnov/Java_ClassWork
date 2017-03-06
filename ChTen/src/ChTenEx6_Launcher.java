import java.io.*;

/**
 * Created by Matthew on 3/2/2017.
 */
public class ChTenEx6_Launcher
{
    public static void main(String[] args) throws IOException
    {
        //creates the file
        File file = new File("nom.dat");
        //number array field
        int [] numbers = {1,2,3,4,5};
        //sends the array and field name to the ChTenEx6_FieldArray class
        ChTenEx6_FieldArray.writeArray(file.getName(),numbers);
        ChTenEx6_FieldArray.readArray(file.getName(),numbers);
    }
}
