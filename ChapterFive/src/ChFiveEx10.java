/**
 * Created by Matthew on 2/6/2017.
 */
    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class ChFiveEx10 {
        private double monthlyIntrest; // monthly intrest rate
        private double balance; // balance
        private double totalWithdraw; // total amount for withdrawn
        private double totalDeposit; // total amount for deposits
        private double totalIntrest; // total dolar amount for intrest
        /**
         * Constructor that sets the beging value for balance
         */
        public ChFiveEx10(double startBalance) {
            setBalance(startBalance);
        }
        /**
         * Adds a deposit amount to the balance
         */
        public void deposit(double number){
            balance = balance + number;
        }
        /**
         * subtracts the withdrawn amount from balance
         */
        public void withdrawn(double number){
            balance = balance - number;
        }
        /**
         *sets the total interest
         *adds the intrest earned to the balance
         */
        public void intrest(){
            totalIntrest = balance * (monthlyIntrest / 100);
            balance = balance + (balance * (monthlyIntrest / 100));
        }
        /**
         * @return the balance
         */
        public double getBalance() {
            return balance;
        }
        /**
         * @param balance the balance to set
         */
        public void setBalance(double balance) {
            this.balance = balance;
        }
        /**
         * @return the monthlyIntrest
         */
        public double getMonthlyIntrest() {
            return monthlyIntrest / 100;
        }
        /**
         * param monthlyIntrest the monthlyIntrest to set
         */
        public void setMonthlyIntrest(double anualIntrest) {
            this.monthlyIntrest = anualIntrest / 12;
        }
        /**
         * @return the totalWithdraw
         */
        public double getTotalWithdraw() {
            return totalWithdraw;
        }
        /**
         * @param totalWithdraw the totalWithdraw to set
         */
        public void setTotalWithdraw(double totalWithdraw) {
            this.totalWithdraw += totalWithdraw;
        }
        /**
         * @return the totalDeposit
         */
        public double getTotalDeposit() {
            return totalDeposit;
        }
        /**
         * @param totalDeposit the totalDeposit to set
         */
        public void setTotalDeposit(double totalDeposit) {
            this.totalDeposit += totalDeposit;
        }
        /**
         * @return the totalIntrest
         */
        public double getTotalIntrest() {
            return totalIntrest;
        }
}
