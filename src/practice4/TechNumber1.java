package practice4;

import java.util.Scanner;
public class TechNumber1 {

    public static void main(String args[])
    {
        int n,num,digits=0,firstHalf,secondHalf,squareOfSum=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to check");
        n = scan.nextInt();

        num = n;
        while(num>0)
        {
            digits++;
            num = num/10;
        }
        if(digits%2==0)
        {
            num = n;
            firstHalf = num%(int)Math.pow(10,digits/2);
            secondHalf = num%(int)Math.pow(10,digits/2);
            squareOfSum = (firstHalf+secondHalf)*(firstHalf+secondHalf);
            if(n == squareOfSum)
            {
                System.out.println(n+"is a tech number");
            }
            else {
                System.out.println(n+"is not a tech number");
            }
        }
        else{
            System.out.println(n+"is not a tech number");
        }
    }
}
