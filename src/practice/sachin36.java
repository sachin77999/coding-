package practice;
import java.util.Scanner;
public class sachin36 {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp=num;
        int sum=0,factorial=1,remainder;
        while(num!=0)
        {
            factorial=1;
            remainder=num%10;
            for(int i=1;i<=remainder;i++)
            {
                factorial=factorial*i;
            }
            sum=sum+factorial;
            num=num/10;

        }
        if(sum==temp)
            System.out.println("Peterson Number");
        else
            System.out.println("Not Peterson Number");
    }
}
