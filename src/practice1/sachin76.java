package practice1;

import java.util.Scanner;
public class sachin76 {

    public static void main(String args[])
    {
        int lowerRange=0,upperRange=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lower range");
        lowerRange = scan.nextInt();

        System.out.println("Enter the upper range");
        upperRange = scan.nextInt();

        for(int i=lowerRange;i<=upperRange;i++)
        {
            if(isSpyNumber(i))
                System.out.println(i+" ");
        }
    }
    private static boolean isSpyNumber(int number)
    {
        int remainder;
        int sum=0,product=1;
        while(number>0)
        {
            remainder = number%10;
            sum = sum+remainder;
            product = product*remainder;
            number = number/10;
        }
        if(sum==product)
            return true;
        return false;
    }
}
