package practice;
import java.util.Scanner;

public class sachin7 {

    public static void main(String args[])
    {
        int n=343,remainder,sum=0;
        int temp=n;
        while(n>0)
        {
            remainder=n%10;
            sum=(sum*10)+remainder;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a palindrome Number");
    }
}
