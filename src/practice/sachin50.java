package practice;

import java.util.Scanner;
public class sachin50 {

    public static void main(String args[])
    {
        int number,num;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        int n=number;
        int firstHalf,secondHalf,square,sum=0,countDigits=0,newNumber;
        while(n>0)
        {
            countDigits++;
            n=n/10;
        }
        if(countDigits%2==0)
        {
         n = number;
         firstHalf = n%(int)Math.pow(10,countDigits/2);
         secondHalf = n/(int)Math.pow(10,countDigits/2);
         newNumber = (firstHalf + secondHalf)*(firstHalf+secondHalf);
         if(number == newNumber){
             System.out.println(number+" is a tech number");
         }
         else {
             System.out.println(number+"is not a tech number");
         }
        }
        else {
            System.out.println(number+"is not a tech number");
        }
    }
}
