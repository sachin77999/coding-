import java.util.*;
public class PalindromeExample2 {

    public static void main(String args[])
    {
        String original,reverse="";
        Scanner scan = new Scanner(System.in);
        original=scan.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equals(reverse))
            System.out.println("Enter string/number is palindrome");
        else
            System.out.println("Entered string/number is not palindrome");
    }
}
