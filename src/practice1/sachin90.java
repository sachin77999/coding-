package practice1;

import java.util.Scanner;
public class sachin90 {

    public static void main(String args[])
    {
        int number = 50;
        System.out.println(sumNaturalNumber(number));

    }

    static int sumNaturalNumber(int number)
    {
        int sum = 0;
        for(int i=1;i<=number;i++)
        {
            sum = sum+i;
        }
        return sum;
    }
}
