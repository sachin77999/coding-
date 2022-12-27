package practice1;

import java.util.Scanner;
public class sachin127 {

    public static void main(String args[])
    {
        int number;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        if(number>0)
        {
            System.out.println("The number is positive");
        }
        else if(number<0)
        {
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
