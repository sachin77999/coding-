package practice;
import java.util.Scanner;

public class sachin44 {
    public static void main(String args[])
    {
        int number,factorial=1,sum=0;
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        int temp=number;
        while(number!=0)
        {
            factorial=1;
            int remainder=number%10;
            for(int i=1;i<=remainder;i++)
            {
                factorial=factorial*i;
            }
            sum=sum+factorial;
            number=number/10;
        }
        if(sum==temp)
            System.out.println("Peterson Number");
        else
            System.out.println("Not A peterson Number");

    }
}
