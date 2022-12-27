package practice;
import java.util.Scanner;
public class sachin35 {
    public static void main(String args[])
    {
        int num,sum=0,rem;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();//145
        int fact = 1;
        if(num>0) {//(145<0)

            rem=num%10;//5
            for(int i=1;i<=rem;i++)//<=5
            {
                sum=sum+(fact*i);
            }
            num=num/10;
        }
        System.out.println(sum);
    }
}
