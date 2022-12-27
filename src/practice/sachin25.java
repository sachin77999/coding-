package practice;

import java.util.Scanner;
public class sachin25 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        int remainder,temp,sum=0;
        temp = number;

        while(number > 0)
        {
            remainder = number % 10;
            sum = (sum*10) + remainder;
            number = number/10;
        }
        System.out.println(sum);

    }
}
