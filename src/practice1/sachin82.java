package practice1;

import java.util.Scanner;
public class sachin82 {

    public static void main(String args[])
    {
        int range;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of range");

        range = scan.nextInt();

        for(int i=1;i<=range;i++)
            checkNumber(i);
    }

    static void checkNumber(int number)
    {
        if(number%10==7 || number%7==0)
            System.out.println(number+"is a buzz number");
    }
}
