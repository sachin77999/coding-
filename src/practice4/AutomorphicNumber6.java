package practice4;

import java.util.Scanner;
public class AutomorphicNumber6 {

    private static double Square;

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number you want to check");

        int number = scan.nextInt();
        int count = 0;

        int square = number*number;
        int temp = number;

        while(temp>0)
        {
            count++;
            temp = temp/10;
        }
        int lastDigit = (int)(square%(Math.pow(10,count)));
        if(number == lastDigit)
            System.out.println(number+"is an automorphic number");
        else
            System.out.println(number+"is not an automorphic number");
    }

}
