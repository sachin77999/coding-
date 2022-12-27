package practice;

import java.util.Scanner;
public class sachin42 {
    public static void main(String args[])
    {
        int number,remainder,sum=0,temp,factorial=1;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        temp = number;
        while(number!=0) {
            factorial=1;
            remainder = number%10;
            for(int i=1;i<=remainder;i++)
            {
                factorial=factorial*i;
            }
            sum=sum+factorial;
            number=number/10;
        }
        if(temp == sum)
            System.out.println("Peterson Number");
        else
            System.out.println("Not a Peterson Number");
    }
}
