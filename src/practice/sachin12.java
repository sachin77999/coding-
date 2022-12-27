package practice;
import java.util.Scanner;

public class sachin12 {

    public static void main(String args[])
    {
        int number,factorial=1;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        for(int i=1;i<=number;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}
