package practice4;

import java.util.Scanner;

public class AutomorphicNumber8 {

    private static boolean isAutomorphic(int number)
    {
        int count = 0; // declare a count variable
        int square = number*number; // do square of original number
        int temp = number;  // store original number into temporary variable
        while(temp>0) // apply the condition while temporary number>0
        {
            count++; // do count ++
            temp = temp/10;// get the number divided by 10
        }
        int lastDigit = (int)(square%(Math.pow(10,count))); // get the lastDigit of square of number
        return number == lastDigit; // if last digit of originalNumber == lastDigit than return
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int start,end;
        System.out.println("Enter starting value");
        start = scan.nextInt();
        System.out.println("Enter ending value");
        end = scan.nextInt();
        System.out.println("Automorphic numbers between "+start+"and"+end);
        for(int i=start;i<=end;i++)
        {
            if(isAutomorphic(i))
                System.out.println(i+" ");
        }

    }
}
