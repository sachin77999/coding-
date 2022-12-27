package practice;

import java.util.Scanner;
public class sachin39 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num;
        num=scan.nextInt();
        int temp=num;
        int factorial=1,remainder,sum=0;
        while (num!=0)
        {
            factorial=1;
            remainder=num%10;
            for(int i=1;i<=remainder;i++)
            {
                factorial=factorial*i;
            }
            sum=sum+factorial;
            num=num/10;
        }
        if(temp==sum)
           System.out.println("PETERSON NUMBER");
        else
            System.out.println("NOT PETERSON NUMBER");
    }
}
