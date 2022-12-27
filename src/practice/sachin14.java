package practice;

import java.util.Scanner;
import java.lang.Math;
public class sachin14 {
    static boolean isArmstrong(int number)
    {
        int temporaryNumber,remainder,count=0;
        double sum=0;
        temporaryNumber=number;
        while(temporaryNumber>0)
        {
            temporaryNumber=temporaryNumber/10;
            count++;
        }
        temporaryNumber=number;
        while(temporaryNumber>0)
        {
            remainder=temporaryNumber%10;
            sum=sum+(Math.pow(remainder,count));
            number=number/10;
        }
        if(number==sum)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {

        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=0;i<=num;i++)

            if(isArmstrong(i))
                System.out.println(i+",");

    }
}
