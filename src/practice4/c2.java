package practice4;

import java.util.Scanner;
public class c2 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number you want to reverse");
        number = scan.nextInt();

        System.out.println("The reversed number is:");
        reverseNumber(number);
    }
    public static void reverseNumber(int number)
    {
        if(number<10)
        {
            //print the same number if number is less than 10
            System.out.println(number);
            return;
        }
        else
        {
            System.out.println(number%10);
            reverseNumber(number/10);
        }
    }
}
