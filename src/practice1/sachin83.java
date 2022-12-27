package practice1;

import java.util.Scanner;
public class sachin83 {

    public static void main(String args[])
    {
        int number1;
        Scanner scan = new Scanner(System.in);

        number1=scan.nextInt();

        int number2;
        number2=scan.nextInt();

        if(checkNumber(number1))
            System.out.println(number1+"is a duck number");
        else
            System.out.println(number1+"is not a duck number");

        if(checkNumber(number2))
            System.out.println(number2+"is a duck number");
        else
            System.out.println(number2+"is not a duck number");
    }
    public static boolean checkNumber(int number)
    {
        while(number!=0)
        {
            if(number%10==0)
                return true;

            number=number/10;
        }
        return false;
    }
}
