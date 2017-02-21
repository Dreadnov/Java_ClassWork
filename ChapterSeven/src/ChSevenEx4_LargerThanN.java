/**
 * Created by Matthew on 2/16/2017.
 */
public class ChSevenEx4_LargerThanN
{
    private static int n, incN;
    private static int arr[] = {10,15,20,25,30,999,1525,117};

    public static int getIncN()
    {
        return incN;
    }
    public static void setIncN(int incN)
    {
        ChSevenEx4_LargerThanN.incN = incN;
    }

    public static int getN()
    {
        return n;
    }
    public static void setN(int n)
    {
        ChSevenEx4_LargerThanN.n = n;
    }

    public static int[] getArr()
    {
        return arr;
    }
    public static void setArr(int[] arr)
    {
        ChSevenEx4_LargerThanN.arr = arr;
    }

    public static void inc()
    {
        for (int i = 0; i < getArr().length ; i++)
        {
            if (getN() < getArr()[i])
            {
                System.out.print("\n" + getArr()[i]);
            }
        }
    }
}








