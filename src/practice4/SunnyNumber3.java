package practice4;

import java.util.Scanner;
public class SunnyNumber3 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number you want to check");

        int n = scan.nextInt();
        isSunnyNumber(n);
    }
    static boolean checkPerfectNumber(double num)
    {
        double square_root = Math.sqrt(num);
                return ((square_root-Math.floor(square_root))==0);
    }
    static void isSunnyNumber(int n)
    {
        if(checkPerfectNumber(n+1))
        {
            System.out.println("The given number is a sunny number");
        }
        else
        {
            System.out.println("The given number is not a sunny number");
        }
    }
}
