package practice;
import java.util.Scanner;

public class sachin9 {

    public static void main(String args[])
    {
        String original,reverse="";
        Scanner scan=new Scanner(System.in);
        original=scan.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}
