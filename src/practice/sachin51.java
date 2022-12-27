package practice;

import java.util.Scanner;
public class sachin51 {

    public static void main(String args[])
    {
        int num,firstHalf,secondHalf,squareSum,sum=0,countDigits=0;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        num=n;
        while(num>0)
        {
            countDigits++;
            num=num/10;
        }
        if(countDigits%2==0)
        {
            num=n;
            firstHalf=num% (int)Math.pow(10,countDigits/2);
            secondHalf=num/(int)Math.pow(10,countDigits/2);
            squareSum=(firstHalf+secondHalf)*(firstHalf+secondHalf);
            if(n==squareSum)
            {
                System.out.println(n+"is tech number");
            }
            else {
                System.out.println(n+"is not a tech number");
            }
        }
        else {
            System.out.println(n+"is not a tech number");
        }

    }
}
