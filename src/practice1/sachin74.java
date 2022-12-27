package practice1;

import java.util.Scanner;

public class sachin74 {

    public static void main(String args[])
    {
        int number,sum=0,product=1,remainder;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        while(number>0)
        {
            remainder=number%10;
            sum=sum+remainder;
            product=product*remainder;
            number=number/10;
        }
        if(sum==product)
            System.out.println("the given number is a spy number");
        else
            System.out.println("the given number is not a spy number");
    }
}
