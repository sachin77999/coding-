package practice1;

import java.util.Scanner;
public class sachin80 {

    public static void main(String args[])
    {
        int n1,n2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number");
        n1 = scan.nextInt();

        System.out.println("Enter 2nd number");
        n2 = scan.nextInt();

        if(checkNumber(n1))
            System.out.println(n1+"is a buzz number");
        else
            System.out.println(n1+"is not a buzz number");

        if(checkNumber(n2))
            System.out.println(n2+"is a buzz number");
        else
            System.out.println(n2+"is not a buzz number");
    }

    static boolean checkNumber(int number)
    {
        if(number%10==7 || number%7==0)
            return true;
        else
            return false;
    }
}
