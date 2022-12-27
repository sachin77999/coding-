package practice1;

import java.util.Scanner;
public class sachin86 {

    public static void main(String args[])
    {
        int number,sum=0;
        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();

        for(int i=1;i<=number;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
