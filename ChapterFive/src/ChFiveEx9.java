/**
 * Created by Matthew on 2/6/2017.
 */

    import java.text.DecimalFormat;

    public class ChFiveEx9
    {
        private int employeeNum; // employee number
        private double grossPay; // gross pay
        private double stateTax;// state tax
        private double federalTax;// federal tax
        private double fica;//FICA withholdings
        /**
         * empty constructor
         */
        public ChFiveEx9() {
        }

        /**
         * @return the employeeNum
         */
        public int getEmployeeNum() {
            return employeeNum;
        }
        /**
         * @param employeeNum the employeeNum to set
         */
        public void setEmployeeNum(int employeeNum) {
            this.employeeNum = employeeNum;
        }

        /**
         * @return the grossPay
         */
        public double getGrossPay() {
            return grossPay;
        }

        /**
         * @param grossPay the grossPay to set
         */
        public void setGrossPay(double grossPay) {
            this.grossPay = grossPay;
        }

        /**
         * @return the stateTax
         */
        public double getStateTax() {
            return stateTax;
        }

        /**
         * @param stateTax the stateTax to set
         */
        public void setStateTax(double stateTax) {
            this.stateTax = stateTax;
        }

        /**
         * @return the federalTax
         */
        public double getFederalTax() {
            return federalTax;
        }

        /**
         * @param federalTax the federalTax to set
         */
        public void setFederalTax(double federalTax) {
            this.federalTax = federalTax;
        }

        /**
         * @return the fica
         */
        public double getFica() {
            return fica;
        }

        /**
         * @param fica the fica to set
         */
        public void setFica(double fica) {
            this.fica = fica;
        }
        /**
         * return the net pay which is calculated as
         * net pay = gross pay - state tax - federal tax - fica
         * @return
         */
        public double getNetPay(){
            return (grossPay - stateTax - federalTax - fica);
        }
        public void printEmployeeReport(){
            DecimalFormat formatter = new DecimalFormat("$###, ##0.00");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                    "Employee Number: " + this.getEmployeeNum() + "\n" +
                    "Gross pay" + formatter.format(this.getGrossPay()) + "\n" +
                    "state tax" + formatter.format(this.getStateTax()) + "\n" +
                    "federal tax" + formatter.format(this.getFederalTax()) + "\n" +
                    "FICA Withholding:" + formatter.format(this.getFica()) + "\n" +
                    "net pay" + formatter.format(this.getNetPay()));
        }
        public void printTotals( double grossPay, double stateTax, double
                federalTax, double fica, double netPay){
            DecimalFormat formatter = new DecimalFormat("$###,##0.00");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                    "All employee totals" + "\n" +
                    "Gross pay" + formatter.format(grossPay) + "\n" +
                    "state tax" + formatter.format(stateTax) + "\n" +
                    "federal tax" + formatter.format(federalTax) + "\n" +
                    "FICA Withholding:" + formatter.format(fica) + "\n" +
                    "net pay" + formatter.format(netPay));
        }
    }

