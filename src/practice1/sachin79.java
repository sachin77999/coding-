package practice1;

import java.util.Scanner;

public class sachin79 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        if(isEmirp(number)==true)
            System.out.println("The given number is an emirpNumber");
        else
            System.out.println("The given number is not an emirp number");

    }
    public static boolean isEmirp(int n)
    {
        if(isPrime(n)==false)
            return false;

        int reverse=0;
        while(n!=0)
        {
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n=n/10;
        }
        return isPrime(reverse);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;

        for(int i=2;i<n;i++)

            if(n%i==0)
                return false;
            return true;
        }
    }

