package practice;
import java.util.*;
public class sachin41 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        isSunnyNumber(N);
    }
    static boolean findPerfectNumber(double num)
    {
        double square_root=Math.sqrt(num);
        return((square_root-Math.floor(square_root))==0);
    }
    static void isSunnyNumber(int N)
    {
        if(findPerfectNumber(N+1))
        {
            System.out.println("The given number is a sunny number");
        }
        else {
            System.out.println("The given number is not a sunny number");
        }
    }
}
