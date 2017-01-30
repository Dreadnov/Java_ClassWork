import javax.swing.*;
import java.text.MessageFormat;

/**
 * Created by Matthew on 1/26/2017.
 */
public class ChFourEx10
{
    private static double temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter in the current temp"));
        //displays the temp and if its freeing or boiling
    public static void Dis()
    {
      String table = String.format(MessageFormat.format("Ethyl : Freezing({0}) Boiling({1})", isEthylFreezing(), isEthylBoiling()));
             table += String.format(MessageFormat.format("\nOxygen : Freezing({0}) Boiling({1})", isOxygenFreezing(), isOxygenBoiling()));
             table += String.format(MessageFormat.format("\nWater : Freezing({0}) Boiling({1})", isWaterFreezing(), isWaterBoiling()));
             JOptionPane.showMessageDialog(null,table);
    }


    // checks if the temp is within saiod range and will return the value of true or false depending on user input
    private static boolean isEthylFreezing()
    {
        if (temp <= -173) return true;else return false;
    }

    private static boolean isEthylBoiling()  {if (temp >= 173) return true;else return false;}

    private static boolean isOxygenFreezing() {if (temp <= -362) return true;else return false;}

    private static boolean isOxygenBoiling() {if (temp >= -306) return true;else return false;}

    private static boolean isWaterFreezing() {if (temp <= 32) return true;else return false;}

    private static boolean isWaterBoiling() {if (temp >= 212) return true;else return false;}

}
