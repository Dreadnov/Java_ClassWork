/**
 * Created by Matthew on 2/17/2017.
 */
public class ChSevenEx7_QuarterlySales
{
    private final int DIV = 6;
    private final int QTRS = 4;
    private double totalSales[] = new double[QTRS];
    private double AVGSales;
    private int count = 0;
    public ChSevenEx7_QuarterlySales() {
// TODO Auto-generated constructor stub
    }
    public void counter(){
        count++;
    }
    /**
     * @return the totalSales
     */
    public double[] getTotalSales() {
        return totalSales;
    }
    /**
     * @param sales the totalSales to set
     */
    public void setTotalSales(double sales) {
        totalSales[count] += sales;
    }
    /**
     * @return the aVGSales
     */
    public double getAVGSales() {
        return AVGSales;
    }
    /**
     * @param i the aVGSales to set
     */
    public void setAVGSales(int i) {
        AVGSales = totalSales[i] / DIV;
    }
}
