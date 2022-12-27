package practice4;

import java.util.Scanner;
public class c1 {

    public static void main(String args[])
    {
        int number,remainder,reverse=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input");
        number = scan.nextInt();

        while(number>0)
        {
            remainder = number%10;
            reverse = reverse*10+remainder;
            number = number/10;
        }
        System.out.println(reverse);
    }
}
