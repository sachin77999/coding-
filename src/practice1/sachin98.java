package practice1;

import java.util.Scanner;
public class sachin98 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of n to compute nth prime number");

        int n = scan.nextInt();
        int num =1,count=0,i;
        while(count<n)
        {
            num = num+1;
            for(i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    break;
                }
            }
            if(i==num)
            {
                count = count+1;
            }
        }
        System.out.println("The " + n + "th prime number is:" + num);
    }
}
