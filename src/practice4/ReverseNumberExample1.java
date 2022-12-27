package practice4;

import java.util.Scanner;
public class ReverseNumberExample1 {

public static void main(String args[])
{
    int number,reverse=0,remainder,sum=0;
    Scanner scan = new Scanner(System.in);

    number = scan.nextInt();
    while(number>0)
    {
        remainder = number%10;
        sum = (sum*10)+remainder;
        number = number/10;
    }
    System.out.println(sum);
}
}
