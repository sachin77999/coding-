package practice1;

import java.util.Scanner;
public class sachin122 {

    public static void main(String args[])
    {
        int a,b,c,largest,temp;

        Scanner scan = new Scanner(System.in);
        // reading input from the user
        System.out.println("Enter first number");
        a = scan.nextInt();
        System.out.println("Enter second number");
        b = scan.nextInt();
        System.out.println("Enter the third number");
        c = scan.nextInt();
        temp = a>b?a:b;

        largest=c>temp?c:temp;
        System.out.println("Largest number is"+largest);
    }
}
