

import javax.swing.*;

/**
 * Created by Matthew on 1/26/2017.
 */
public class ChFourEx9
{
  private static int dis;

    public static void GetSound()
    {
        char speed = JOptionPane.showInputDialog("Select\n " +
                "A: for Air\n" +
                "W: for Water\n" +
                "S: for Steel ").charAt(0);

        dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter in the distance:"));

        double time = 0;
        if (!(speed == 'A' || speed == 'W' || speed == 'S'))
        {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        } else
        {

            switch (speed)
            {

                case 'A':
                    JOptionPane.showMessageDialog(null, "Time in Air: " + String.format("%,.2f", getSpeedInAir(dis)));
                    break;
                case 'W':
                    JOptionPane.showMessageDialog(null, "Time in Water: " + String.format("%,.2f", getSpeedInWater(dis)));
                    break;
                case 'S':
                    JOptionPane.showMessageDialog(null, "Time in Steel: " + String.format("%,.2f", getSpeedInSteel(dis)));
                    break;
            }
        }
    }
    private static double getSpeedInAir(int Distance)
    {
        return (double)Distance / 1100;
    }
    private static double getSpeedInWater(int Distance )
    {
       return (double)Distance / 4900;
    }
    private static double getSpeedInSteel(int Distance)
    {
       return (double)Distance / 16400;
    }

    }
