package practice;

import java.util.Scanner;
public class sachin48 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        isSunnyNumber(number);
    }
    static void isSunnyNumber(int N)
    {
        if(isPerfectNumber(N+1))
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not a sunny number");
        }
    }
    static boolean isPerfectNumber(double number)
    {
        double square_root=Math.sqrt(number);
        return ((square_root-Math.floor(square_root))==0);
    }
}
