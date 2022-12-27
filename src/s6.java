import java.util.Scanner;
public class s6 {

    static int naturalNumberSum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n = 50;
        System.out.println(naturalNumberSum(n));
    }
}
