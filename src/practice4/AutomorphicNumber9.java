package practice4;

import java.util.Scanner;
public class AutomorphicNumber9 {

    private static boolean isAutomorphic(int number)
    {
        int square = number*number; // do the square of number
        int count = 0; // make a variable store count = 0
        int temp = number; // store original number into temporary number

        while(temp>0) // check the condition while temporary number>0
        {
            count++; // do count++
            temp = temp/10; // divide the number by 10
        }
        int lastDigit = (int)(square%(Math.pow(10,count))); // get the lastDigit of number
        return number == lastDigit; // if lastDigit == number than return
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);// get the input from user
        int start,end;
        System.out.println("Enter the starting value:");
        start = scan.nextInt(); // enter the starting value
        System.out.println("Enter the ending value:");
        end = scan.nextInt();// enter the ending vale
        for(int i=start;i<=end;i++)// apply for loop from start to end
        {
            if(isAutomorphic(i)) // check the condition if it is automorphic
                // prints the number if it is automorphic
                System.out.println(i+" ");// than print the automorphic number
        }
    }
}
