import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Matthew on 3/6/2017.
 */
public class TheaterRevenueCalculator
{
    private JPanel teaterRevCalc;

    private JTextField adultTicketPrice;
    private JTextField adultTicketsSold;
    private JTextField childTicketPrice;
    private JTextField childTicketSold;

    private JLabel adultGrossRevenue;
    private JLabel adultNetRevenue;
    private JLabel childGrossRevenue;
    private JLabel childNetRevenue;
    private JLabel totalGrossRevenue;
    private JLabel totalNetRevenue;
    private JButton button1;

    public TheaterRevenueCalculator()
    {
        button1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouseEvent)
            {
                super.mouseClicked(mouseEvent);
                Thread thread = new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        calcRevenue();
                    }
                });
                thread.start();
            }

        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("TheaterRevenueCalculator");
        frame.setContentPane(new TheaterRevenueCalculator().teaterRevCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void calcRevenue()
    {
        final double payment = .20;

        double adultTicketP = Double.parseDouble(adultTicketPrice.getText());
        int adultTicketsS = Integer.parseInt(adultTicketsSold.getText());
        double childTicketP = Double.parseDouble(childTicketPrice.getText());
        int childTicketS = Integer.parseInt(childTicketSold.getText());

        double adultGrossRev = adultTicketP * adultTicketsS;
        double adultNetRev =  adultGrossRev - (adultGrossRev * payment);
        double childGrossRev = childTicketP * childTicketS;
        double childNetRev = childGrossRev - (childGrossRev * payment);
        double totalGrossRev = adultGrossRev + childGrossRev;
        double totalNetRev = totalGrossRev - (totalGrossRev * payment);


        adultGrossRevenue.setText(String.valueOf(adultGrossRev));
        adultNetRevenue.setText(String.valueOf(adultNetRev));
        childGrossRevenue.setText(String.valueOf(childGrossRev));
        childNetRevenue.setText(String.valueOf(childNetRev));
        totalGrossRevenue.setText(String.valueOf(totalGrossRev));
        totalNetRevenue.setText(String.valueOf(totalNetRev));
    }

}
