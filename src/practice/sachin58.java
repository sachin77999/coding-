package practice;

import javax.swing.*;
import java.util.Scanner;
public class sachin58 {
    public static void main(String args[])
    {
        int number;
        boolean found = true;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        int n2,n3;
        n2 = number*2;
        n3 = number*3;
        String concatStr = number+""+n2+n3;
        for(char c='1';c<='9';c++)
        {
            int count = 0;
            for(int i=0;i<concatStr.length();i++)
            {
                char ch = concatStr.charAt(i);
                if(ch==c)
                {
                    count++;
                }
            }
            if(count>1 || count==0){
                found=false;
            break;
        }
    }
    if(found)
        System.out.println(number+"is a fascinating number");
    else
        System.out.println(number+"is not a fascinating number");
}
}