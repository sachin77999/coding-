package practice;
import java.util.Scanner;
public class sachin46 {
    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        isSunnyNumber(number);
    }
    static boolean checkPerfectNumber(double num)
    {
        double square_root = Math.sqrt(num);
        return ((square_root-Math.floor(square_root))==0);
    }
    static void isSunnyNumber(int N)
    {
        if(checkPerfectNumber(N+1))
        {
         System.out.println("The given number is sunny number");
        }
        else
        {
            System.out.println("The given number is not sunny number");
        }
    }
}
