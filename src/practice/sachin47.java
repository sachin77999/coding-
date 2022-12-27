package practice;

import java.util.Scanner;
public class sachin47 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        isSunnyNumber(number);
    }
    static boolean isPerfectNumber(double number)
    {
        double square_root=Math.sqrt(number);
        return((square_root-Math.floor(square_root))==0);
    }
    static void isSunnyNumber(int N)
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

}
