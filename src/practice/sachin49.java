package practice;
import java.util.Scanner;
public class sachin49 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number;
        number=scan.nextInt();
        isSunnyNumber(number);
    }
    static  void isSunnyNumber(int N)
    {
        if(isPerfectNumber(N+1))
        {
            System.out.println("sunny number");
        }
        else
        {
            System.out.println("Not a sunny number");
        }
    }
    static boolean isPerfectNumber(int number)
    {
        double square_root=Math.sqrt(number);
        return ((square_root-Math.floor(square_root))==0);
    }
}
