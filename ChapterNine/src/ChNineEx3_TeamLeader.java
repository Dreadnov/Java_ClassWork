/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx3_TeamLeader extends ChNineEx1_ProductionWorker
{
    //fields
    double monthlyBonusAmount;
    int requiredTraining;
    int attendedTraining;

    //getters and setters for their respected fields
    public double getMonthlyBonusAmount()
    {
        return monthlyBonusAmount;
    }
    public void setMonthlyBonusAmount(double monthlyBonusAmount)
    {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }
    public int getRequiredTraining()
    {
        return requiredTraining;
    }
    public void setRequiredTraining(int requiredTraining)
    {
        this.requiredTraining = requiredTraining;
    }
    public int getAttendedTraining()
    {
        return attendedTraining;
    }
    public void setAttendedTraining(int attendedTraining)
    {
        this.attendedTraining = attendedTraining;
    }

    //args-constructor that will call the ChNineEx1_ProductionWorker super and then also use the shift,hourlyPayRate,monthlyBonusAmount,requiredTraining and attendedTraining
    public ChNineEx3_TeamLeader(String name, String number, String startDate, int shift, double hourlyPayRate, double monthlyBonusAmount, int requiredTraining, int attendedTraining)
    {
        super(name, number, startDate, shift, hourlyPayRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.requiredTraining = requiredTraining;
        this.attendedTraining = attendedTraining;
    }

    // overrides the final outcome and displays as the new format
    @Override
    public String toString()
    {
        return "\nEmployee Name: " + getEmployeeName() +
                "\nEmployee Number: " + getEmployeeNumber() +
                "\nEmployee Start Date: " + getHireDate() +
                "\nHourly Pay Rate: " + String.format("$%,.2f", getHourlyPayRate()) +
                "\nShift: " + getShift() +
                "\nMonthly Bonus: " + String.format("$%,.2f", monthlyBonusAmount) +
                "\nRequired Training: " + requiredTraining + " Hrs" +
                "\nAttended Training: " + attendedTraining + " Hrs" +
                "\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    }
}
