package practice1;

import java.util.Scanner;
public class sachin81 {

    public static void main(String args[])
    {
        int number1,number2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number");
        number1 = scan.nextInt();

        System.out.println("Enter 2nd number");
        number2 = scan.nextInt();

        if(checkNumber(number1))
            System.out.println(number1+"is a buzz number");
        else
            System.out.println(number1+"is a buzz number");

        if(checkNumber(number2))
            System.out.println(number2+"is a buzz number");
        else
            System.out.println(number2+"is not a buzz number");
    }

    static boolean checkNumber(int number)
    {
        if(number%10==7 || number%7==0)
            return true;
        else
            return false;
    }
}
