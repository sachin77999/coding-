package practice;

import java.util.Scanner;
public class sachin23 {

    public static void main(String args[])
    {
        int number1,number2;
        Scanner scan = new Scanner(System.in);
        number1 = scan.nextInt();
        number2 = scan.nextInt();

        number1 = number1+number2;
        number2 = number1-number2;
        number1 = number1-number2;

        System.out.println(number1);
        System.out.println(number2);
    }
}
