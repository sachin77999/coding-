package practice1;

import java.util.Scanner;
public class sachin112 {

    public static void main(String args[])
    {
        int x=12,y=8,gcd=1;
        // running loop from 1 to the smallest of both numbers
        for(int i=1;i<=x && i<=y;i++)
        {
            // returns true if both conditions are satisfied
            if(x%i==0 && y%i==0)
                // storing the value of variable i in gcd
                gcd=i;
        }
        //prints the gcd
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);

    }
}
