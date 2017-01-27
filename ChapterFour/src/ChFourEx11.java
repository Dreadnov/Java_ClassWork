import javax.swing.*;
/**
 * Created by Matthew on 1/27/2017.
 */
public class ChFourEx11
{
    public static void dis()
    {
        char input = 0;
        int min = 0;
        double time = 0,calc = 0;
      char planInput =  JOptionPane.showInputDialog("Choose a Subscription" +
                                    "\n\nPackage A: For $39.99 per month 450 minutes are provided. Additionally minutes are\n$0.45 per minute." +
                                    "\n\nPackage B: For $59.99 per month 900 minutes are provided. Additionally minutes are\n$0.40 per minute." +
                                    "\n\nPackage C: For $69.99 per month Unlimited minutes are provided." ).charAt(0);
        if (planInput == 'A')
        {
             input = 'A';
        }
        if (planInput == 'B')
        {
            input = 'B';
        }
        if (planInput == 'C')
        {
            input = 'C';
        }

        double minInput = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of minutes you used this month."));

        if (input == 'A')
        {
            if (minInput >= 450)
            {
                time = (minInput - 450);
                calc = (time  * 0.45) + 39.99;
                JOptionPane.showMessageDialog(null,  "\nTime used this month:" + String.format("%,.2f", minInput)
                        + "\nTotal for this month:" + String.format("$%,.2f", calc));
            }
            else
            {
                time = minInput;
                calc = 39.99;
                JOptionPane.showMessageDialog(null,  "\nTime used this month:" + String.format("%,.2f", minInput)
                       + "\nTotal for this month:" + String.format("$%,.2f", calc));
            }
        }
        if (input == 'B')
        {
            if (minInput >= 900)
            {
                time = (minInput - 900);
                calc = (time  * 0.40) + 59.99;
                JOptionPane.showMessageDialog(null,  "\nTime used this month:" + String.format("%,.2f", minInput)
                        + "\nTotal for this month:" + String.format("$%,.2f", calc));
            }
            else
            {
                time = minInput;
                calc = 59.99;
                JOptionPane.showMessageDialog(null,  "\nTime used this month:" + String.format("%,.2f", time)
                        + "\nTotal for this month:" + String.format("$%,.2f", calc));
            }
        }
        if (input == 'C')
        {
            time = minInput;
            calc = 69.99;
                JOptionPane.showMessageDialog(null,  "\nTime used this month:" + String.format("%,.2f", time)
                        + "\nTotal for this month:" + String.format("$%,.2f", calc));

        }

    }

}
