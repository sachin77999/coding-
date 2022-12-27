package practice4;

import java.util.Scanner;
public class SunnyNumber2 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int number = scan.nextInt();
        isSunnyNumber(number);
    }
    static boolean findPerfectSquare(double num)
    {
        double square_root = Math.sqrt(num);
        return ((square_root-Math.floor(square_root))==0);
    }
    static void isSunnyNumber(int n)
    {
        if(findPerfectSquare(n+1))
        {
            System.out.println("The given number is a suny number");
        }
        else {
            System.out.println("The given number is not a sunny number");
        }
    }
}
