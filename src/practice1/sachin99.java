package practice1;

import java.util.Scanner;
public class sachin99 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of n to compute nth prime number");

        // reading an integer from the user

        int n = scan.nextInt();
        int num = 1,count=0,i;
        while(count<n)   // 0<5
        {
            num = num+1;  // num = 1+1;

            for(i=2;i<=num;i++)
            {
                if(num%i == 0)
                {
                    break;
                }
            }
            if(i == num)
            {
                // increments the count variable by 1 if number is prime
                count = count +1;
            }
        }
        // print the nth prime number
        System.out.println("The " +n+ " th prime number is :"+num);
    }
}
