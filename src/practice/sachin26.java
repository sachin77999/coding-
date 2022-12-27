package practice;

import java.util.Scanner;
public class sachin26 {

    public static void reverseNumber(int number)
    {
        if(number<10)
        {
            System.out.println(number);
            return;
        }
        else {
            System.out.println(number%10);
            reverseNumber(number/10);
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        reverseNumber(num);
    }

}
