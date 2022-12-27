package practice1;
import java.util.Scanner;
public class sachin126 {

    public static void main(String args[])
    {
        int num;

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        if(num>0)
        {
            System.out.println("The number is positive");
        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}
