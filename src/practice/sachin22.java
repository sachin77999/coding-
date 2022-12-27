package practice;

import java.util.Scanner;
public class sachin22 {

    public static void main(String args[])
    {
        int number1,number2,temp;
        Scanner scan = new Scanner(System.in);
        number1 = scan.nextInt();
        number2 = scan.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(number1);
        System.out.println(number2);
    }
}
