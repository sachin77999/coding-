import java.util.Scanner;
public class PrimeExample4 {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt();
        int end = scan.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
