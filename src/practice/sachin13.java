package practice;

import java.util.Scanner;
public class sachin13 {

    public static void main(String args[])
    {
        int number,remainder,sum=0;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        int temp=number;
        while(number>0)
        {
            remainder=number%10;
            sum=sum+(remainder*remainder*remainder);
            number=number/10;

        }
        if(temp==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not An Armstrong Number");
    }
}
