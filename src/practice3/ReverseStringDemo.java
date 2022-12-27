package practice3;

import java.util.Scanner;
public class ReverseStringDemo {

    public static void main(String args[])
    {
        ReverseStringDemo rs = new ReverseStringDemo();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println(rs.reverse(str));
    }
    static String reverse(String s)
    {
        String r="";
        for(int i =s.length();i>0;i--)
        {
            r=r+(s.charAt(i-1));
        }
        return r;
    }


}
